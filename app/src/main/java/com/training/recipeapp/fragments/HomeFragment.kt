package com.training.recipeapp.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
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
import androidx.navigation.fragment.findNavController
import com.training.recipeapp.data.recipeclass

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

        recyclerView = view.findViewById(R.id.recyclerViewRecipe)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        recyclerViewCategory = view.findViewById(R.id.recyclerViewCategory)
        recyclerViewCategory.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        fetchRecipes()
        fetchCategories()

        return view
    }

    private fun fetchRecipes() {
        apiService.getRecipes().enqueue(object : Callback<recipeclass> {


            override fun onResponse(call: Call<recipeclass>, response: Response<recipeclass>) {
                if (response.isSuccessful) {
                    val recipes = response.body()?.meals ?: emptyList()
                    adapter = RecipeAdapterHorizontal(recipes) { recipe ->
                        // Handle recipe item click
                        val action = HomeFragmentDirections.actionHomeFragmentToRecipeDetailFragment2(recipe.idMeal)
                        findNavController().navigate(action)
                    }
                    recyclerView.adapter = adapter
                } else {
                    Toast.makeText(mContext, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<recipeclass>, t: Throwable) {
                Toast.makeText(mContext, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun fetchCategories() {
        apiService.getCategories().enqueue(object : Callback<CategoryResponse> {
            override fun onResponse(
                call: Call<CategoryResponse>,
                response: Response<CategoryResponse>
            ) {
                if (response.isSuccessful) {
                    val categories = response.body()?.categories ?: emptyList()
                    adapterCategory = RecipeAdapterCategory(categories) { category ->

                        val bundle = Bundle().apply {
                            putString("CATEGORY_NAME", category.strCategory)
                        }
                        findNavController().navigate(R.id.action_homeFragment_to_recipeListFragment, bundle)
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






