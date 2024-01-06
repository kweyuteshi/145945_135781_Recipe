package com.example.recipes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.bumptech.glide.Glide
import com.example.recipes.R
import com.example.recipes.dataClasses.Meal
import com.example.recipes.databinding.ActivityMainBinding
import com.example.recipes.databinding.ActivityMealBinding
import com.example.recipes.databinding.FragmentHomeBinding
import com.example.recipes.fragments.HomeFragment
import com.example.recipes.viewModel.MealViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class MealActivity : AppCompatActivity() {
    private lateinit var mealId:String
    private lateinit var mealName:String
    private lateinit var mealThumb:String
    private lateinit var binding: ActivityMealBinding
    private lateinit var mealMvvm: MealViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMealBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mealMvvm = ViewModelProviders.of(this)[MealViewModel::class.java]
        getMealInformation()
        setInformationInviews()
        mealMvvm.getMealDetail(mealId)
        observeMealDetailsLiveData()
    }

    private fun  observeMealDetailsLiveData( ){
        mealMvvm.observerMealdDetailsLiveData().observe(this, object : Observer<Meal> {
            override fun onChanged(value: Meal) {
                val meal = value

                binding.tvCategory.text = "Catgory : ${meal!!.strCategory}"
                binding.tvArea.text = "Area : ${meal.strArea}"
                binding.tvInstructionsSteps.text = meal.strInstructions
            }
        })
    }
    private fun setInformationInviews(){
        Glide.with(applicationContext)
            .load(mealThumb)
            .into(binding.imgMealDetail)

        binding.collapsingToolbar.title = mealName
        binding.collapsingToolbar.setCollapsedTitleTextColor(resources.getColor(R.color.white))
        binding.collapsingToolbar.setExpandedTitleColor(resources.getColor(R.color.white))

    }
    private fun getMealInformation(){
        val intent = intent
        mealId = intent.getStringExtra(HomeFragment.MEAL_ID)!!
        mealName = intent.getStringExtra(HomeFragment.MEAL_NAME)!!
        mealThumb = intent.getStringExtra(HomeFragment.MEAL_THUMB)!!


    }
}