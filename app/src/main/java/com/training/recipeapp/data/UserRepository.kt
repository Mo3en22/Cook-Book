package com.training.recipeapp.data

import androidx.lifecycle.LiveData
import androidx.room.Room
import com.training.recipeapp.data.db.FavoriteRecipeDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class UserRepository(private var  userDao: UserDao,private var recipeDao: FavoriteRecipeDao) {
   // val allUsers: LiveData<List<User>> = userDao.getAllUser()
 fun getAllUsers(): LiveData<List<User>> =userDao.getAllUser()

    suspend fun insertUser(user: User) {
        userDao.insert(user)
    }

    fun getUserByEmail(email: String): LiveData<User?> {
        return userDao.getUserByEmail(email)
    }

    suspend fun insertRecipe(recipe: Meal) {
        recipeDao.upsertRecipe(recipe)
    }

    fun getAllFavorites(): LiveData<List<Meal>> {
        return recipeDao.getAllFavorites()
    }

    suspend fun deleteRecipe(recipe: Meal) {
        recipeDao.delete(recipe)
    }


}

