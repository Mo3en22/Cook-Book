package com.training.recipeapp.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: UserRepository = UserRepository(
        AppDatabase.getDatabase(application).userDao(),
        AppDatabase.getDatabase(application).favoriteRecipeDao()
    )



    fun insertUser(user: User) = viewModelScope.launch(Dispatchers.IO) {
        repository.insertUser(user)
    }

    suspend fun getUser(email: String): User? {
        return repository.getUserByEmail(email)
    }



}
