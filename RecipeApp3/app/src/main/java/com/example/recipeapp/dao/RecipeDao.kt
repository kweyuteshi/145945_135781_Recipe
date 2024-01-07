package com.example.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipeapp.entities.Recipes

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipes ORDER BY id DESC")
    fun getAllRecipes(): List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inertRecipe(recipe: Recipes)
}