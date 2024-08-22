package com.training.recipeapp.mealadpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.training.recipeapp.R
import com.training.recipeapp.fragments.Recipe

@Suppress("DEPRECATION")
class RecipeAdapterHorizontal(
    private val recipes: List<Recipe>,
    private val onItemClick: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeAdapterHorizontal.RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe_linear, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        val recipe = recipes[position]
        holder.bind(recipe)
        holder.itemView.setOnClickListener { onItemClick(recipe) }

    }

    override fun getItemCount(): Int =recipes.size

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val recipename: TextView = itemView.findViewById(R.id.tv_meal_name)
        private val recipeimage: ImageView = itemView.findViewById(R.id.iv_meal)

        fun bind(recipe: Recipe) {
            recipename.text = recipe.strMeal
            recipeimage.load(recipe.strMealThumb) {
                crossfade(true)
                placeholder(R.drawable.broken_image)
                error(R.drawable.error_outline)
            }
        }


    }
}
