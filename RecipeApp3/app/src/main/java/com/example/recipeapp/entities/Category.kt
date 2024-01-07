package com.example.recipeapp.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Category")
data class Category(
        @PrimaryKey(autoGenerate = true)
        var id:Int,

        @ColumnInfo(name = "category")
        var category:String,
        )