package com.training.recipeapp.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.training.recipeapp.R
import com.training.recipeapp.RecipeActivity

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            val isLoggedIn = checkLoginStatus()

            if (isAdded) { // Ensure fragment is attached
                val navController = findNavController()
                if (isLoggedIn) {
                    startActivity()
                } else {
                    navController.navigate(R.id.action_splashFragment_to_loginFragment)
                }
            }
        }, 2000)
        val scale = AnimationUtils.loadAnimation(context, R.anim.scale)
        val alpha = AnimationUtils.loadAnimation(context, R.anim.alpha)

        view.findViewById<View>(R.id.image).startAnimation(scale)
        view.findViewById<View>(R.id.tv_welcome).startAnimation(alpha)
        view.findViewById<View>(R.id.tv_to).startAnimation(alpha)
        view.findViewById<View>(R.id.tv_cookbook).startAnimation(alpha)
    }

    private fun checkLoginStatus(): Boolean {
        return if (isAdded) {
            val sharedPreferences = requireActivity().getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
            sharedPreferences.getBoolean("isLoggedIn", false)
        } else {
            false
        }
    }

    private fun startActivity() {
        if (isAdded) { // Ensure fragment is attached
            val intent = Intent(requireContext(), RecipeActivity::class.java)
            requireActivity().finish()
            startActivity(intent)
        }
    }
}


