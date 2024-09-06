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
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import coil.load
import com.training.recipeapp.R
import com.training.recipeapp.data.AppDatabase
import com.training.recipeapp.data.Meal
import com.training.recipeapp.data.recipeclass
import com.training.recipeapp.databinding.FragmentRecipeDetailBinding
import com.training.recipeapp.viewmodel.HomeViewModel
import com.training.recipeapp.viewmodel.favmealviewmodel
import com.training.recipeapp.viewmodel.mealviewmodelfactroy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecipeDetailFragment : Fragment() {
    private val args: RecipeDetailFragmentArgs by navArgs()
    private lateinit var apiService: ApiService
    private lateinit var recipeImageView: ImageView
    private lateinit var binding: FragmentRecipeDetailBinding
    private lateinit var recipeNameTextView: TextView
    private lateinit var recipeInstructionsTextView: TextView
    private lateinit var recipeTypeTextView: TextView
    private lateinit var recipeIngredientsTextView: TextView
    private lateinit var recipeVideoWebView: WebView
    private lateinit var shareIcon: ImageView
    private lateinit var recipeRatingBar: RatingBar
    private lateinit var submitRatingButton: Button

    private lateinit var mealmvvm: favmealviewmodel
    private var isInstructionsVisible = false
    private var isLiked = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentRecipeDetailBinding.inflate(inflater, container, false)
        return binding.root}


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
        val mealDatabase = AppDatabase.getDatabase(requireContext())
        val mealviewmodelfactroy = mealviewmodelfactroy(mealDatabase)
        mealmvvm= ViewModelProvider(this,mealviewmodelfactroy)[favmealviewmodel::class.java]

        // Initialize Retrofit
        apiService = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        // Get recipe ID from arguments
        val recipeId = args.idmeal
        val recipeISFav=args.isfavouraiat
        if (recipeISFav){
            isLiked=true
            binding.floatingActionButton.setImageResource(R.drawable.baseline_favorite_24)

        }
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
        onfavoritclike()
    }
    private fun onfavoritclike() {
        binding.floatingActionButton.setOnClickListener{
            if (isLiked){
                mealtofav?.let {
                    mealmvvm.deletfromfavmeallist(it)
                    Toast.makeText(requireContext(),"Meal Deleted",Toast.LENGTH_SHORT).show()
                }//  Snackbar.make(requireView(),"Meal Deleted",Snackbar.LENGTH_LONG).setAction(
//                    "Undo",
//                    View.OnClickListener {
//                        viewModel.insertmealtofav(FavmealAdpter.differ.currentList[position])
//                    }
//                ).show()
                isLiked=false
                binding.floatingActionButton.setImageResource(R.drawable.baseline_favorite_border_24)

            }
            else{
            mealtofav?.let {
                mealmvvm.insertmealtofav(it)
                Toast.makeText(requireContext(),"Meal Saved",Toast.LENGTH_SHORT).show()
            }
                binding.floatingActionButton.setImageResource(R.drawable.baseline_favorite_24)
            }
            isLiked=true
        }
    }
    private var mealtofav:Meal?=null
    private fun fetchRecipeById(id: String) {
        apiService.getRecipeById(id).enqueue(object : Callback<recipeclass> {




            override fun onResponse(call: Call<recipeclass>, response: Response<recipeclass>) {
            if (response.isSuccessful) {
                val recipe = response.body()?.meals?.firstOrNull()
                recipe?.let {
                    mealtofav=recipe
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
                showError("Failed to load recipe details")}
            }

            override fun onFailure(call: Call<recipeclass>, t: Throwable) {
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

    private fun extractIngredients(recipe: Meal): String {
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
