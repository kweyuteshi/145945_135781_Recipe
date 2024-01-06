package com.example.recipefinalattempt;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<MyHolder> {
    private Context context;
    private List<Recipes> recipes;

    public RecyclerViewAdapter(Context context, List<Recipes>recipes){
        this.context = context;
        this.recipes = recipes;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.cardview_recipe,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int position) {
        myHolder.recipeTitle.setText(recipes.get(position).getRecipeName());
        myHolder.img_recipe_thumbnail.setImageResource(recipes.get(position).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,RecipeActivity.class);

                intent.putExtra("RecipeName",recipes.get(position).getRecipeName());
                intent.putExtra("RecipeIngredients",recipes.get(position).getRecipeIngredients());
                intent.putExtra("RecipeMethodTitle",recipes.get(position).getRecipeMethodTitle());
                intent.putExtra("Recipe",recipes.get(position).getRecipe());
                intent.putExtra("Thumbnail",recipes.get(position).getThumbnail());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }


}
