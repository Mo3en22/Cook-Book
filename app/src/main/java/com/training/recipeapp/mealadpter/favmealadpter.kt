package com.training.recipeapp.mealadpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.training.recipeapp.data.Meal
import com.training.recipeapp.databinding.ItemCardBinding

class FavoriteMealsAdpter(private val onItemClick: (Meal) -> Unit):RecyclerView.Adapter<FavoriteMealsAdpter.FavMealViewHolder>() {
 inner class FavMealViewHolder(val binding: ItemCardBinding):RecyclerView.ViewHolder(binding.root){
   init {
           binding.root.setOnClickListener {
               val position = adapterPosition
               if (position != RecyclerView.NO_POSITION) {
                   val meal = differ.currentList[position]
                   onItemClick(meal)
               }
           }

   }}


    private val diffUtil = object : DiffUtil.ItemCallback<Meal>() {
        override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
            return oldItem.idMeal == newItem.idMeal
        }

        override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffUtil)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavMealViewHolder {
        return FavMealViewHolder(
            ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: FavMealViewHolder, position: Int) {
        val meal =differ.currentList[position]
        Glide.with(holder.itemView).load(meal.strMealThumb).into(holder.binding.ivProduct)
        holder.binding.tvProduct.text = meal.strMeal
    }

}