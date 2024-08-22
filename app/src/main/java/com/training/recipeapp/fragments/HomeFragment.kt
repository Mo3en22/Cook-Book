package com.training.recipeapp.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.training.recipeapp.R
import com.training.recipeapp.mealadpter.RecipeAdapterCategory
import com.training.recipeapp.mealadpter.RecipeAdapterHorizontal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecipeAdapterHorizontal
    private lateinit var recyclerViewCategory: RecyclerView
    private lateinit var adapterCategory: RecipeAdapterCategory
    private lateinit var mContext: Context

    private val apiService: ApiService
            by lazy {
                Retrofit.Builder()
                    .baseUrl("https://www.themealdb.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiService::class.java)
            }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        mContext = requireContext()

        recyclerView = view.findViewById(R.id.recyclerView_recipe)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        recyclerViewCategory = view.findViewById(R.id.recyclerView_category)
        recyclerViewCategory.layoutManager = GridLayoutManager(context,3)
        fetchRecipes()
        fetchCategories()

        return view
    }

    private fun fetchRecipes() {
        apiService.getRecipes().enqueue(object : Callback<RecipeResponse> {
            override fun onResponse(
                call: Call<RecipeResponse>,
                response: Response<RecipeResponse>
            ) {
                if (response.isSuccessful) {
                    val recipes = response.body()?.meals ?: emptyList()
                    adapter = RecipeAdapterHorizontal(recipes) { recipe ->
                        // Handle recipe item click
                        val bundle = Bundle().apply {
                            putString("RECIPE_ID", recipe.idMeal)
                        }
                        findNavController().navigate(R.id.action_homeFragment_to_recipeDetailFragment2, bundle)
                    }
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                Toast.makeText(mContext, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun fetchCategories() {
        apiService.getCategories().enqueue(object : Callback<CategoryResponse> { // Assuming you have a CategoryResponse class
            override fun onResponse(
                call: Call<CategoryResponse>,
                response: Response<CategoryResponse>
            ) {
                if (response.isSuccessful) {
                    val categories = response.body()?.categories ?: emptyList()
                    adapterCategory = RecipeAdapterCategory(categories) { category ->
                        // Handle category item click
                        // ... (Implement navigation or other actions)
                    }
                    recyclerViewCategory.adapter = adapterCategory
                }
            }

            override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
                Toast.makeText(mContext, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
            }
        })
    }

}
