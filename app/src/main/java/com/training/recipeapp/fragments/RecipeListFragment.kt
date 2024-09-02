package com.training.recipeapp.fragments

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
import com.training.recipeapp.data.recipeclass
import com.training.recipeapp.mealadpter.RecipeAdapterHorizontal
import com.training.recipeapp.mealadpter.RecipeListAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecipeListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecipeListAdapter
    private lateinit var apiService: ApiService
    private lateinit var categoryName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            categoryName = it.getString("CATEGORY_NAME") ?: ""
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewRecipes)
        recyclerView.layoutManager = GridLayoutManager(context,2)
            //LinearLayoutManager(context)

        apiService = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
        val numberOfColumns = 2 // Number of columns in the grid
        val gridLayoutManager = GridLayoutManager(context, numberOfColumns)
        recyclerView.layoutManager = gridLayoutManager
        fetchRecipesByCategory()

        return view
    }

    private fun fetchRecipesByCategory() {
        apiService.getRecipesByCategory(categoryName).enqueue(object : Callback<recipeclass> {

            override fun onResponse(call: Call<recipeclass>, response: Response<recipeclass>) {
                if (response.isSuccessful) {
                    val recipes = response.body()?.meals ?: emptyList()
                    adapter = RecipeListAdapter(recipes) { recipe ->
                        // Handle recipe item click
                        val action = RecipeListFragmentDirections.actionRecipeListFragmentToRecipeDetailFragment(recipe.idMeal)
                        findNavController().navigate(action)
                    }
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<recipeclass>, t: Throwable) {
                Toast.makeText(context, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
