package com.training.recipeapp.mealadpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.training.recipeapp.R
import com.training.recipeapp.data.Meal

@Suppress("DEPRECATION")
class RecipeListAdapter(private val recipes: List<Meal>,
                        private val onItemClick: (Meal) -> Unit): RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder>() {
    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val recipename: TextView = itemView.findViewById(R.id.tv_meal_namelist)
        private val recipeimage: ImageView = itemView.findViewById(R.id.iv_meallist)

        fun bind(recipe: Meal) {
            recipename.text = recipe.strMeal
            recipeimage.load(recipe.strMealThumb) {
                crossfade(true)
                placeholder(R.drawable.broken_image)
                error(R.drawable.error_outline)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount(): Int =recipes.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        val recipe = recipes[position]
        holder.bind(recipe)
        holder.itemView.setOnClickListener { onItemClick(recipe) }
    }
}