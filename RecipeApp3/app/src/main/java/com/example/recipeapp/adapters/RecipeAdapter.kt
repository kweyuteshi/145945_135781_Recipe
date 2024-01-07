package com.example.recipeapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.RecipeActivity
import com.example.recipeapp.entities.Recipes
import com.example.recipeapp.recipeViewHolder.RecipeViewHolder

class RecipeAdapter(private val context: Context, private val recipes: List<Recipes>) : RecyclerView.Adapter<RecipeViewHolder>() {

    var recipe = ArrayList<Recipes>()

    fun setData(arrData : List<Recipes>){
        recipe = arrData as ArrayList<Recipes>
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.randomvariable_sub,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.dishName.text = recipe[position].dishName
        holder.img_dish.setImageResource(recipe[position].img_dish)
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
        return recipe.size
    }
}