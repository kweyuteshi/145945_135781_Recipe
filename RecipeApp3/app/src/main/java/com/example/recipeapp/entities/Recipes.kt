package com.example.recipeapp.entities

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.io.Serializable

@Entity(tableName = "Recipes")
data class Recipes (
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    //  title
    @ColumnInfo(name = "dishName")
    var dishName:String,
//  type
    @ColumnInfo(name = "category")
    var category: String,
//  number of servings
    @ColumnInfo(name = "serves")
    var servings:String,
//  difficulty level
    @ColumnInfo(name = "difficulty")
    var difficulty:String,
//  ingredients
    @ColumnInfo(name = "ingredients")
    var ingredients:String,
//  preparation steps
    @ColumnInfo(name = "steps")
    var steps:String,

    var img_dish:Int
): Serializable

