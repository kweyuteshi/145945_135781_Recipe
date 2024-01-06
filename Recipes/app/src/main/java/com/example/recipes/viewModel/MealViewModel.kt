package com.example.recipes.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recipes.dataClasses.FoodList
import com.example.recipes.dataClasses.Meal
import com.example.recipes.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MealViewModel(): ViewModel(){
    private var mealDetailsLiveData = MutableLiveData<Meal>()

   fun getMealDetail(id:String){
       RetrofitInstance.api.getRandomFood().enqueue(object : retrofit2.Callback<FoodList> {
           override fun onResponse(call: Call<FoodList>, response: Response<FoodList>) {
               if(response.body()!=null){
                   mealDetailsLiveData.value = response.body()!!.meals[0]
               }
               else
                   return
           }

           override fun onFailure(call: Call<FoodList>, t: Throwable) {
               Log.d("MealActivity",t.message.toString())
           }

       })
   }
    fun observerMealdDetailsLiveData():LiveData<Meal>{
        return mealDetailsLiveData
    }

}