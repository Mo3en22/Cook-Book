package com.training.recipeapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.training.recipeapp.R

public class FavFragmentDirections private constructor() {
  public companion object {
    public fun actionFavFragmentToCreatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favFragment_to_creatorFragment)

    public fun actionFavFragmentToRecipeDetailFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favFragment_to_recipeDetailFragment)
  }
}
