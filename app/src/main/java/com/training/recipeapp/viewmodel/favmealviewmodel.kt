package com.training.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.training.recipeapp.data.AppDatabase
import com.training.recipeapp.data.Meal
import com.training.recipeapp.data.db.favoriteRecipe
import kotlinx.coroutines.launch

class favmealviewmodel(
   val appDatabase: AppDatabase
):ViewModel() {

    fun insertmealtofav(favoriteRecipe: Meal){
        viewModelScope.launch {
            appDatabase.favoriteRecipeDao().upsertRecipe(favoriteRecipe)
        }
    }
    fun deletfromfavmeallist(favoriteRecipe: Meal){
        viewModelScope.launch {
            appDatabase.favoriteRecipeDao().delete(favoriteRecipe)
        }
    }

}