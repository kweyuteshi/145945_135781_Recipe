package com.example.recipeapp.recipeViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R

class RecipeViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    var dishName: TextView = itemView.findViewById(R.id.dishName)
    var cardView: CardView = itemView.findViewById(R.id.cardview_id)
    var img_dish: ImageView = itemView.findViewById(R.id.img_dish)

}