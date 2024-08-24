package com.training.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.training.recipeapp.data.AppDatabase

class Homeviewmodelfactroy(private val appDatabase: AppDatabase): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeViewModel(appDatabase) as T
    }
}