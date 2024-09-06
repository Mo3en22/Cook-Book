package com.training.recipeapp.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.training.recipeapp.R
import com.training.recipeapp.data.User
import com.training.recipeapp.data.UserViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.mindrot.jbcrypt.BCrypt

class updateEmailFragment : Fragment() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update_email, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]

        val sharedPreferences = requireActivity().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val email = sharedPreferences.getString("email", "")
        val Password = sharedPreferences.getString("Password", "")

        if (email.isNullOrEmpty()) {
            // Handle the case where email is null or empty
            Log.e("UpdateEmailFragment", "Email is not available in SharedPreferences")
            return
        }

        Log.i("UpdateEmailFragment", "Retrieved email: $email")

        val emailView = view.findViewById<TextView>(R.id.email)
        val passwordView = view.findViewById<TextView>(R.id.password)
        val buttonconfrim=view.findViewById<Button>(R.id.b_Confirmend)
        val emaileditText = view.findViewById<EditText>(R.id.Email_box)
        val passwordEditText = view.findViewById<EditText>(R.id.password_box2)
        var user1:User?=null
        // Observe the user data using the email
        userViewModel.getUser(email).observe(viewLifecycleOwner, Observer { user ->
            if (user != null) {
                user1=user
                emailView.text = user.email
                passwordView.text = Password
            } else {
                // Handle the case where user data is not available
                Log.e("UpdateEmailFragment", "User not found for email: $email")
                emailView.text = "User not found"
                passwordView.text = ""
            }
        })
        buttonconfrim.setOnClickListener {
            val email = emaileditText?.text.toString().trim().lowercase()
            val password = passwordEditText?.text.toString()
            if(email.isEmpty()||password.isEmpty()){
                Toast.makeText(requireContext(), "Error: All fields are required!!!", Toast.LENGTH_SHORT).show() }
            else{
                var valid = true
                if (!isValidEmail(email)) {
                    Toast.makeText(requireContext(), "Invalid email format", Toast.LENGTH_SHORT).show()
                    valid = false
                }
                if (!isValidPassword(password)) {
                    Toast.makeText(requireContext(), "Invalid password format", Toast.LENGTH_SHORT).show()
                    valid = false
                }
                if (valid) {
                    val hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt())
                    lifecycleScope.launch {
                        withContext(Dispatchers.IO) {
                            user1?.let { it1 -> userViewModel.updateUser(it1,email,hashedPassword) }

                            val prefs = requireActivity().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
                            with(prefs.edit()) {
                                putString("email", email)
                                putString("Password", password)
                                putString("hashedPassword",hashedPassword)
                                apply()
                            }
                        }
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), "User updated successfully!", Toast.LENGTH_SHORT).show()
                            findNavController().navigate(R.id.action_updateEmailFragment_to_homeFragment)
                        }
                    }
                }
            }
        }
    }
    private fun isValidPassword(password: String): Boolean {
        return password.length >= 8 &&
                password.contains(Regex("[A-Z]")) &&
                password.contains(Regex("[a-z]")) &&
                password.contains(Regex("[0-9]"))
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
