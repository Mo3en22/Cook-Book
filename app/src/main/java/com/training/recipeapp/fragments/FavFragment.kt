package com.training.recipeapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.training.recipeapp.R
import androidx.lifecycle.Observer
import com.training.recipeapp.RecipeActivity
import com.training.recipeapp.databinding.FragmentFavBinding
import com.training.recipeapp.mealadpter.FavoriteMealsAdpter
import com.training.recipeapp.viewmodel.HomeViewModel

class FavFragment : Fragment() {
    private lateinit var binding: FragmentFavBinding
    private lateinit var viewModel: HomeViewModel
    private lateinit var FavmealAdpter: FavoriteMealsAdpter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as RecipeActivity).viewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFavBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareRecyclerView()
        observeFavorites()
        val itemTouchHelper= object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.RIGHT or ItemTouchHelper.LEFT
        ){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            )=true

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position =viewHolder.adapterPosition
                viewModel.deletfromfavmeallist(FavmealAdpter.differ.currentList[position])
//                Snackbar.make(requireView(),"Meal Deleted",Snackbar.LENGTH_LONG).setAction(
//                    "Undo",
//                    View.OnClickListener {
//                        viewModel.insertmealtofav(FavmealAdpter.differ.currentList[position])
//                    }
//                ).show()
                Toast.makeText(requireContext(),"Meal Deleted", Toast.LENGTH_SHORT).show()
            }

        }
        ItemTouchHelper(itemTouchHelper).attachToRecyclerView(binding.rvFavouritMeals)
    }

    private fun prepareRecyclerView() {
        FavmealAdpter = FavoriteMealsAdpter{meal ->
            val action = FavFragmentDirections.actionFavFragmentToRecipeDetailFragment(meal.idMeal)
            findNavController().navigate(action)
            // Handle item click
//            val recipeDetailFragment = RecipeDetailFragment.newInstance(meal.idMeal)
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, recipeDetailFragment)
//                .addToBackStack(null)
//                .commit()
        }

        binding.rvFavouritMeals.apply {
            layoutManager= LinearLayoutManager(context)
            adapter=FavmealAdpter
        }

    }



    private fun observeFavorites() {
        viewModel.observeFavoriteMealsLiveData().observe(viewLifecycleOwner,Observer { meals ->
            FavmealAdpter.differ.submitList(meals)
        })

    }
}