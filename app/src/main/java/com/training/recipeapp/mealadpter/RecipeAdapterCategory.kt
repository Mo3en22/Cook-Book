package com.training.recipeapp.mealadpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.training.recipeapp.R
import com.training.recipeapp.fragments.Category


class RecipeAdapterCategory(
    private val categories:List<Category>,
    private val onItemClick: (Category) -> Unit
) : RecyclerView.Adapter<RecipeAdapterCategory.RecipeViewHolder>() {

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val categoryName: TextView = itemView.findViewById(R.id.tv_category_name)
        private val categoryImage: ImageView = itemView.findViewById(R.id.iv_category)
        fun bind(category: Category){
            categoryName.text=category.strCategory
            Glide.with(itemView.context)
                .load(category.strCategoryThumb)
                .into(categoryImage)


        }

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeAdapterCategory.RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val category=categories[position]
        holder.bind(category)
        holder.itemView.setOnClickListener {
            onItemClick(category)
        }
    }

    override fun getItemCount(): Int =categories.size
}






