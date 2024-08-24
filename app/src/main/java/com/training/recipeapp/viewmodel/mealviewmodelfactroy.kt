package com.training.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.training.recipeapp.data.AppDatabase

class mealviewmodelfactroy(private val appDatabase: AppDatabase):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return favmealviewmodel(appDatabase) as T
    }
}