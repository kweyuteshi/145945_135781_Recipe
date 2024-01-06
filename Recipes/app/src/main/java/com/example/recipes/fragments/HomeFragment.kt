package com.example.recipes.fragments



import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide

import com.example.recipes.R
import com.example.recipes.activities.MealActivity
import com.example.recipes.dataClasses.FoodList
import com.example.recipes.dataClasses.Meal
import com.example.recipes.databinding.FragmentHomeBinding
import com.example.recipes.retrofit.RetrofitInstance
import com.example.recipes.viewModel.HomeViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment() {

private lateinit var binding:FragmentHomeBinding
private lateinit var homeMvvm: HomeViewModel
private lateinit var randomMeal:Meal

companion object{
    const val MEAL_ID = "com.example.recipes.fragments.idMeal"
    const val MEAL_NAME = "com.example.recipes.fragments.nameMeal"
    const val MEAL_THUMB = "com.example.recipes.fragments.thumbMeal"

}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
homeMvvm = ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeMvvm.getRandomFood()
        observeRandomMeal()
        onRandomMealClick()


       /* RetrofitInstance.api.getRandomFood().enqueue(object : Callback<FoodList>{
            override fun onResponse(call: Call<FoodList>, response: Response<FoodList>) {
                if(response.body() !=null){
                    val randomFood: Meal = response.body()!!.meals[0]
                    Glide.with(this@HomeFragment)
                        .load(randomFood.strMealThumb)
                        .into(binding.imgRandomMeal)
                }else{
                    return
                }
            }

            override fun onFailure(call: Call<FoodList>, t: Throwable) {
                Log.d("HomeFragment",t.message.toString())
            }
        })*/

    }

    private fun onRandomMealClick(){
        binding.randomMealCard.setOnClickListener{
          val intent = Intent(activity,MealActivity::class.java)
            intent.putExtra(MEAL_ID,randomMeal.idMeal)
            intent.putExtra(MEAL_NAME,randomMeal.strMeal)
            intent.putExtra(MEAL_THUMB,randomMeal.strMealThumb)
            startActivity(intent)
        }
    }
    private fun observeRandomMeal(){
        homeMvvm.observeRandomFoodLivedata().observe(viewLifecycleOwner,
        { meal->
                Glide.with(this@HomeFragment)
                .load(meal!!.strMealThumb)
                .into(binding.imgRandomMeal)

            this.randomMeal = meal
        })
    }


}