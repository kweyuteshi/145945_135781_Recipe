package com.example.recipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recipeapp.dao.RecipeDao
import com.example.recipeapp.entities.Category
import com.example.recipeapp.entities.Recipes

@Database(entities = [Recipes::class,Category::class], version = 4, exportSchema = false)
abstract class RecipeDatabase: RoomDatabase() {
    companion object {

        var recipeDatabase:RecipeDatabase?=null
        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if (recipeDatabase == null) {
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }

abstract fun recipeDao():RecipeDao

}