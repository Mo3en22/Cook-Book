package com.training.recipeapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.training.recipeapp.R

public class RecipeDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionRecipeDetailFragmentToCreatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_recipeDetailFragment_to_creatorFragment)
  }
}
