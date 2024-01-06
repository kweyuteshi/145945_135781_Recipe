package com.example.recipes.retrofit

import com.example.recipes.dataClasses.FoodList

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodApi {

    @GET("random.php")
    fun getRandomFood():Call<FoodList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id:String) : Call<FoodList>


}