package com.training.recipeapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import coil.load
import com.training.recipeapp.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecipeDetailFragment : Fragment() {

    private lateinit var apiService: ApiService
    private lateinit var recipeImageView: ImageView
    private lateinit var recipeNameTextView: TextView
    private lateinit var recipeInstructionsTextView: TextView
    private lateinit var recipeVideoWebView: WebView
    private lateinit var shareIcon: ImageView
    private var isInstructionsVisible = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recipeImageView = view.findViewById(R.id.recipeImageView)
        recipeNameTextView = view.findViewById(R.id.recipeNameTextView)
        recipeInstructionsTextView = view.findViewById(R.id.recipeInstructionsTextView)
        recipeVideoWebView = view.findViewById(R.id.recipeVideoWebView)
        shareIcon = view.findViewById(R.id.shareIcon)

        // Initialize Retrofit
        apiService = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        val recipeId = arguments?.getString("RECIPE_ID") ?: return
        fetchRecipeById(recipeId)

        // Set up click listener for recipe name
        recipeNameTextView.setOnClickListener {
            toggleInstructionsVisibility()
        }

        // Set up click listener for share icon
        shareIcon.setOnClickListener {
            shareRecipe()
        }
    }

    private fun fetchRecipeById(id: String) {
        apiService.getRecipeById(id).enqueue(object : Callback<RecipeResponse> {
            override fun onResponse(
                call: Call<RecipeResponse>,
                response: Response<RecipeResponse>
            ) {
                if (response.isSuccessful) {
                    val recipe = response.body()?.meals?.firstOrNull()
                    recipe?.let {
                        recipeNameTextView.text = it.strMeal
                        recipeInstructionsTextView.text = it.strInstructions ?: "No instructions available"
                        recipeImageView.load(it.strMealThumb)
                        recipeInstructionsTextView.visibility = View.GONE // Hide instructions initially

                        // Store the image URL in arguments for sharing
                        arguments?.putString("RECIPE_IMAGE_URL", it.strMealThumb)

                        // إعداد وتشغيل الفيديو
                        val videoUrl = it.strYoutube?.replace("watch?v=", "embed/") ?: ""
                        setupAndLoadVideo(videoUrl)
                    }
                } else {
                    showError("Failed to load recipe details")
                }
            }

            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                showError("Failed to connect to the server")
            }
        })
    }

    private fun setupAndLoadVideo(videoUrl: String) {
        if (videoUrl.isNotEmpty()) {
            recipeVideoWebView.webViewClient = WebViewClient()
            val webSettings: WebSettings = recipeVideoWebView.settings
            webSettings.javaScriptEnabled = true
            recipeVideoWebView.loadUrl(videoUrl)
        }
    }

    private fun toggleInstructionsVisibility() {
        isInstructionsVisible = !isInstructionsVisible
        recipeInstructionsTextView.visibility = if (isInstructionsVisible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    private fun shareRecipe() {
        val recipeName = recipeNameTextView.text.toString()
        val recipeInstructions = recipeInstructionsTextView.text.toString()
        val recipeImageUrl = (arguments?.getString("RECIPE_IMAGE_URL")) ?: "https://www.youtube.com/watch?v=8pPwWqtOFWk"

        val shareText = """
        Check out this recipe!
        
        Name: $recipeName
        Instructions: $recipeInstructions
        Image: $recipeImageUrl
    """.trimIndent()

        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, shareText)
            type = "text/plain"
        }

        startActivity(Intent.createChooser(shareIntent, "Share recipe via"))
    }

    private fun showError(message: String) {
        // Implement your error handling logic here
        // For example, show a Toast or Snackbar with the error message
    }

    companion object {
        @JvmStatic
        fun newInstance(recipeId: String) =
            RecipeDetailFragment().apply {
                arguments = Bundle().apply {
                    putString("RECIPE_ID", recipeId)
                }
            }
    }
}
