package com.training.recipeapp.fragments

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// تعريف استجابة API للوصفات
data class RecipeResponse(
    val meals: List<Recipe>
)

// تعريف الوصفة
data class Recipe(
    val idMeal: String,
    val strMeal: String,
    val strMealThumb: String,
    val strInstructions: String,
    val strYoutube: String?// إضافة التعليمات
)
data class CategoryResponse(
    val categories: List<Category>
)
data class Category(
    val strCategory: String,//category
    val strCategoryThumb:String,//image
    val recipes: List<Recipe>

)

// واجهة API
interface ApiService {
    @GET("api/json/v1/1/search.php?s=")
    fun getRecipes(): Call<RecipeResponse>

    @GET("api/json/v1/1/lookup.php")
    fun getRecipeById(@Query("i") id: String): Call<RecipeResponse>

    @GET("api/json/v1/1/categories.php")
    fun getCategories(): Call<CategoryResponse>

    @GET("api/json/v1/1/filter.php")
    fun getRecipesByCategory(@Query("c") category: String): Call<RecipeResponse>


}
