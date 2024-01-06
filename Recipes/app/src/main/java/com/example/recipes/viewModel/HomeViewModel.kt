package com.example.recipes.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recipes.dataClasses.FoodList
import com.example.recipes.dataClasses.Meal
import com.example.recipes.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel():ViewModel() {
    private var randomFoodLiveData = MutableLiveData<Meal>()
    fun getRandomFood(){
        RetrofitInstance.api.getRandomFood().enqueue(object : Callback<FoodList> {
            override fun onResponse(call: Call<FoodList>, response: Response<FoodList>) {
                if(response.body() !=null){
                    val randomFood: Meal = response.body()!!.meals[0]
                    randomFoodLiveData.value = randomFood

                }else{
                    return
                }
            }

            override fun onFailure(call: Call<FoodList>, t: Throwable) {
                Log.d("HomeFragment",t.message.toString())
            }
        })

    }
    fun observeRandomFoodLivedata():LiveData<Meal>{
        return randomFoodLiveData
    }
}