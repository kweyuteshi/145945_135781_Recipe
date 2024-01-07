package com.example.recipeapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.RecipeActivity
import com.example.recipeapp.databinding.RandomvariableSubBinding
import com.example.recipeapp.entities.Recipes
import com.example.recipeapp.recipeViewHolder.RecipeViewHolder

class SubCategoryAdapter(private val context: Context, private val recipes: List<Recipes>) : RecyclerView.Adapter<RecipeViewHolder>() {

    var arrSubCategory = ArrayList<Recipes>()

    fun setData(arrData : List<Recipes>){
        arrSubCategory = arrData as ArrayList<Recipes>
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.randomvariable_sub,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.dishName.text = arrSubCategory[position].dishName
        holder.img_dish.setImageResource(arrSubCategory[position].img_dish)
        holder.cardView.setOnClickListener{
            val intent = Intent(context, RecipeActivity::class.java).apply {
                putExtra("dishName", recipes[position].dishName)
                putExtra("category", recipes[position].category)
                putExtra("servings", recipes[position].servings)
                putExtra("difficulty", recipes[position].difficulty)
                putExtra("ingredients", recipes[position].ingredients)
                putExtra("steps", recipes[position].steps)
            }
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }
}