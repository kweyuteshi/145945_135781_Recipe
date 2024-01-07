package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecipeActivity : AppCompatActivity() {
    private lateinit var dishName: TextView
    private lateinit var category: TextView
    private lateinit var servings: TextView
    private lateinit var difficulty: TextView
    private lateinit var ingredients: TextView
    private lateinit var steps: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        dishName = findViewById(R.id.dishName)
        category = findViewById(R.id.category)
        servings = findViewById(R.id.servings)
        difficulty = findViewById(R.id.difficulty)
        ingredients = findViewById(R.id.ingredients)
        steps= findViewById(R.id.steps)

        val intent = intent
        dishName.text = intent.getStringExtra("dishName")
        category.text = intent.getStringExtra("category")
        servings.text = intent.getStringExtra("servings")
        difficulty.text = intent.getStringExtra("difficulty")
        ingredients.text = intent.getStringExtra("ingredients")
        steps.text = intent.getStringExtra("steps")

    }
}