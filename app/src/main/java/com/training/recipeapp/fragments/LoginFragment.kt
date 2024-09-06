package com.training.recipeapp.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
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
import com.google.android.material.textfield.TextInputLayout
import com.training.recipeapp.R
import com.training.recipeapp.RecipeActivity
import com.training.recipeapp.data.UserRepository
import com.training.recipeapp.data.UserViewModel
import kotlinx.coroutines.launch
import org.mindrot.jbcrypt.BCrypt

class LoginFragment : Fragment() {
    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userEmailEditText = view.findViewById<TextInputLayout>(R.id.et_user_name)
        val passwordEditText = view.findViewById<TextInputLayout>(R.id.et_password)
        val noAccountTextView = view.findViewById<TextView>(R.id.no_account)
        val loginButton = view.findViewById<Button>(R.id.login)
        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]

        noAccountTextView.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        loginButton.setOnClickListener {

            val email = userEmailEditText.editText?.text.toString()
            val password = passwordEditText.editText?.text.toString()

            //lifecycleScope.launch {

                //val user = userViewModel.getUser(email)
                userViewModel.getUser(email).observe(viewLifecycleOwner , Observer {user->
                if (user != null && BCrypt.checkpw(password, user.hashedPassword) ){


                    val prefs1 =
                        requireActivity().getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
                    with(prefs1.edit()) {
                        putBoolean("isLoggedIn", true)
                        apply()
                    }
                    val prefspassword =
                        requireActivity().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
                    with(prefspassword.edit()) {
                        putString("email", user.email)
                        putString("hashedPassword", user.hashedPassword)
                        putString("Password", password)
                        apply()}
                    startActivity()
                } else {
                    requireActivity().runOnUiThread {
                        Toast.makeText(
                            requireContext(),
                            "Invalid email or password,Please Sign UP First or Try Again",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }})

           // }
        }
    }
    fun startActivity() {
        if (isAdded) { // Ensure fragment is attached
            val intent = Intent(requireContext(), RecipeActivity::class.java)
            requireActivity().finish()
            startActivity(intent)
        }
    }
}