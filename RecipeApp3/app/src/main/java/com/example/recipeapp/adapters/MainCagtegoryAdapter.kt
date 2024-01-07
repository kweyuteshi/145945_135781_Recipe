package com.example.recipeapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.databinding.RandomvariableMainBinding
import com.example.recipeapp.entities.Category

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>(){

    var arrMainCategory = ArrayList<Category>()
    class RecipeViewHolder(
        val binding: RandomvariableMainBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {

    }

    fun setData(arrData : List<Category>) {
        arrMainCategory = arrData as ArrayList<Category>
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RandomvariableMainBinding.inflate(layoutInflater, parent, false)
        return RecipeViewHolder(binding)
      }

    override fun getItemCount(): Int {
       return arrMainCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.binding.tvDishName.text = arrMainCategory[position].category
    }
}