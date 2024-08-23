package com.training.recipeapp.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.training.recipeapp.R
import kotlin.Int
import kotlin.String

public class FavFragmentDirections private constructor() {
  private data class ActionFavFragmentToRecipeDetailFragment(
    public val idmeal: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favFragment_to_recipeDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("idmeal", this.idmeal)
        return result
      }
  }

  public companion object {
    public fun actionFavFragmentToCreatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favFragment_to_creatorFragment)

    public fun actionFavFragmentToRecipeDetailFragment(idmeal: String): NavDirections =
        ActionFavFragmentToRecipeDetailFragment(idmeal)

    public fun actionFavoritesFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favoritesFragment_to_searchFragment)
  }
}
