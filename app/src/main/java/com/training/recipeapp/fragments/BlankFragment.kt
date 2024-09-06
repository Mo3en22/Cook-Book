package com.training.recipeapp.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.training.recipeapp.R
import org.mindrot.jbcrypt.BCrypt

class BlankFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        navController = findNavController()

        val passwordEditText = view.findViewById<EditText>(R.id.passwrod_box)
        val confirmButton = view.findViewById<Button>(R.id.b_Confirm)

        confirmButton.setOnClickListener {
            val password = passwordEditText.text.toString().trim()

            if (password.isEmpty()) {
                Toast.makeText(requireContext(), "Please enter a password", Toast.LENGTH_SHORT).show()

            }

            val sharedPreferences =
                requireActivity().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
            val realPassword = sharedPreferences.getString("hashedPassword", "")
            Log.i("realPassword", realPassword!!)

            if (BCrypt.checkpw(password, realPassword)) {
                navController.navigate(R.id.action_blankFragment_to_updateEmailFragment)
            } else {
                Toast.makeText(requireContext(), "Wrong Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
