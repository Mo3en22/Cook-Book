package com.training.recipeapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout
import com.training.recipeapp.R
import com.training.recipeapp.data.User
import com.training.recipeapp.data.UserRepository
import com.training.recipeapp.data.UserViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.mindrot.jbcrypt.BCrypt

class RegisterFragment : Fragment() {
    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val registerButton = view.findViewById<Button>(R.id.b_register)
        val emailEditText = view.findViewById<TextInputLayout>(R.id.etregister_email)
        val usernameEditText = view.findViewById<TextInputLayout>(R.id.etregister_username)
        val passwordEditText = view.findViewById<TextInputLayout>(R.id.etregister_password)

        registerButton.setOnClickListener {
            val email = emailEditText.editText?.text.toString().trim().lowercase()
            val username = usernameEditText.editText?.text.toString()
            val password = passwordEditText.editText?.text.toString()
            if(email.isEmpty()||username.isEmpty()||password.isEmpty()){
                Toast.makeText(requireContext(), "Error: All fields are required!!!", Toast.LENGTH_SHORT).show() }
            else{
                var valid = true
                if (!isValidEmail(email)) {
                    emailEditText.error = "Invalid email format"
                    valid = false
                } else {
                    emailEditText.error = null
                }

                if (!isValidPassword(password)) {
                    passwordEditText.error = "Invalid password format"
                    valid = false
                } else {
                    passwordEditText.error = null
                }

                if (valid) {
                    val hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt())
                    val user = User(id = 0, email = email, username = username, hashedPassword = hashedPassword)

                    lifecycleScope.launch {
                        withContext(Dispatchers.IO) {
                            userViewModel.insertUser(user)

                            val prefs = requireActivity().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
                            with(prefs.edit()) {
                                putString("email", user.email)
                                putString("username", user.username)
                                putString("hashedPassword", hashedPassword)
                                putString("Password", password)
                                apply()
                            }
                        }
                        withContext(Dispatchers.Main) {
                            Toast.makeText(requireContext(), "User registered successfully!", Toast.LENGTH_SHORT).show()
                            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
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