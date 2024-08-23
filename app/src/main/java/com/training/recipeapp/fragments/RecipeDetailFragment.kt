package com.training.recipeapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
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
    private lateinit var recipeTypeTextView: TextView
    private lateinit var recipeIngredientsTextView: TextView
    private lateinit var recipeVideoWebView: WebView
    private lateinit var shareIcon: ImageView
    private lateinit var recipeRatingBar: RatingBar
    private lateinit var submitRatingButton: Button
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
        recipeTypeTextView = view.findViewById(R.id.recipeTypeTextView)
        recipeIngredientsTextView = view.findViewById(R.id.recipeIngredientsTextView)
        recipeVideoWebView = view.findViewById(R.id.recipeVideoWebView)
        shareIcon = view.findViewById(R.id.shareIcon)
        recipeRatingBar = view.findViewById(R.id.recipeRatingBar)
        submitRatingButton = view.findViewById(R.id.submitRatingButton)

        // Initialize Retrofit
        apiService = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        // Get recipe ID from arguments
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

        // Set up click listener for submit rating button الخاص بالتقييم
        submitRatingButton.setOnClickListener {
            submitRating()
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
                        recipeTypeTextView.text = it.strCategory ?: "Unknown type"
                        recipeIngredientsTextView.text = extractIngredients(it)
                        recipeImageView.load(it.strMealThumb)
                        recipeInstructionsTextView.visibility = View.GONE // Hide instructions initially

                        // Store the image URL in arguments for sharing
                        arguments?.putString("RECIPE_IMAGE_URL", it.strMealThumb)

                        // إعداد وتشغيل الفيديو التحكم
                        val videoUrl = it.strYoutube?.replace("watch?v=", "embed/") ?: "https://www.youtube.com/watch?v=8pPwWqtOFWk"
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
// الجزاء بتاع فيديو اليوتيوب
    private fun setupAndLoadVideo(videoUrl: String) {
        if (videoUrl.isNotEmpty()) {
            recipeVideoWebView.webViewClient = WebViewClient()
            val webSettings: WebSettings = recipeVideoWebView.settings
            webSettings.javaScriptEnabled = true
            recipeVideoWebView.loadUrl(videoUrl)
        }
    }

    private fun extractIngredients(recipe: Recipe): String {
        val ingredients = mutableListOf<String>()

        if (!recipe.strIngredient1.isNullOrEmpty()) {
            ingredients.add("${recipe.strIngredient1} - ${recipe.strMeasure1.orEmpty()}")
        }
        if (!recipe.strIngredient2.isNullOrEmpty()) {
            ingredients.add("${recipe.strIngredient2} - ${recipe.strMeasure2.orEmpty()}")
        }
        if (!recipe.strIngredient3.isNullOrEmpty()) {
            ingredients.add("${recipe.strIngredient3} - ${recipe.strMeasure3.orEmpty()}")
        }
        if (!recipe.strIngredient4.isNullOrEmpty()) {
            ingredients.add("${recipe.strIngredient4} - ${recipe.strMeasure4.orEmpty()}")
        }
        if (!recipe.strIngredient5.isNullOrEmpty()) {
            ingredients.add("${recipe.strIngredient5} - ${recipe.strMeasure5.orEmpty()}")
        }

        return ingredients.joinToString(separator = "\n")
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
        val recipeImageUrl = arguments?.getString("RECIPE_IMAGE_URL").orEmpty()

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
// الكود الخاص بالتوست بتاع التقييم
    private fun submitRating() {
        val rating = recipeRatingBar.rating
        Toast.makeText(requireContext(), "Rating submitted: $rating stars", Toast.LENGTH_SHORT).show()
    }
// عشان يقولي ان انت مش عملت تقييم عشان اعمل ارسال
    private fun showError(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
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
