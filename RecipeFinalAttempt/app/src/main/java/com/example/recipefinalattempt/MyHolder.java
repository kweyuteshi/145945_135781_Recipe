package com.example.recipefinalattempt;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView recipeTitle;
    CardView cardView;
    ImageView img_recipe_thumbnail;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        recipeTitle = (TextView)itemView.findViewById(R.id.recipe_text);
        img_recipe_thumbnail = (ImageView)itemView.findViewById(R.id.recipe_img_id);
        cardView = (CardView)itemView.findViewById(R.id.cardview_id);


    }
}