package com.training.recipeapp.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.training.recipeapp.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToRecipeDetailFragment2(
    public val idmeal: String,
    public val isfavouraiat: Boolean = false,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_recipeDetailFragment2

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("idmeal", this.idmeal)
        result.putBoolean("isfavouraiat", this.isfavouraiat)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToFavFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_favFragment)

    public fun actionHomeFragmentToCreatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_creatorFragment)

    public fun actionHomeFragmentToRecipeDetailFragment2(idmeal: String, isfavouraiat: Boolean =
        false): NavDirections = ActionHomeFragmentToRecipeDetailFragment2(idmeal, isfavouraiat)

    public fun actionHomeFragmentToRecipeListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_recipeListFragment)

    public fun actionHomeFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_searchFragment)
  }
}
