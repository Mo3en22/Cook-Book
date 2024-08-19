package com.training.recipeapp

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RecipenavgationArgs(
  public val RECIPEID: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("RECIPE_ID", this.RECIPEID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("RECIPE_ID", this.RECIPEID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RecipenavgationArgs {
      bundle.setClassLoader(RecipenavgationArgs::class.java.classLoader)
      val __RECIPEID : String?
      if (bundle.containsKey("RECIPE_ID")) {
        __RECIPEID = bundle.getString("RECIPE_ID")
        if (__RECIPEID == null) {
          throw IllegalArgumentException("Argument \"RECIPE_ID\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"RECIPE_ID\" is missing and does not have an android:defaultValue")
      }
      return RecipenavgationArgs(__RECIPEID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RecipenavgationArgs {
      val __RECIPEID : String?
      if (savedStateHandle.contains("RECIPE_ID")) {
        __RECIPEID = savedStateHandle["RECIPE_ID"]
        if (__RECIPEID == null) {
          throw IllegalArgumentException("Argument \"RECIPE_ID\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"RECIPE_ID\" is missing and does not have an android:defaultValue")
      }
      return RecipenavgationArgs(__RECIPEID)
    }
  }
}
