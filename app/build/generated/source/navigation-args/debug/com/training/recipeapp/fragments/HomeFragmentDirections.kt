package com.training.recipeapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.training.recipeapp.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToFavFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_favFragment)

    public fun actionHomeFragmentToCreatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_creatorFragment)

    public fun actionHomeFragmentToRecipeDetailFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_recipeDetailFragment2)

    public fun actionHomeFragmentToRecipeListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_recipeListFragment)
  }
}
