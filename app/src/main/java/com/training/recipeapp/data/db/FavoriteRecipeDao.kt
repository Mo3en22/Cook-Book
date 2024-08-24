package com.training.recipeapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.training.recipeapp.data.FavoriteRecipe
import com.training.recipeapp.data.Meal

@Dao
interface FavoriteRecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertRecipe(recipe: Meal)

    @Query("SELECT * FROM favorite_Recipe")
    fun getAllFavorites(): LiveData<List<Meal>>

    @Delete
   suspend fun delete(recipe: Meal)

}