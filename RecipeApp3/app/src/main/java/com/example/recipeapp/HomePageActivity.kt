package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.adapters.MainCategoryAdapter
import com.example.recipeapp.adapters.SubCategoryAdapter
import com.example.recipeapp.databinding.ActivityHomescreenBinding
import com.example.recipeapp.entities.Category
import com.example.recipeapp.entities.Recipes


class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomescreenBinding
    var arrMainCategory = ArrayList<Category>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter(this,arrSubCategory)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomescreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      categories
       /* arrMainCategory.add(Category(1, "Breakfast"))
        arrMainCategory.add(Category(2, "Lunch"))
        arrMainCategory.add(Category(3, "Supper"))
        arrMainCategory.add(Category(4, "Snack"))

        mainCategoryAdapter.setData(arrMainCategory)*/

//      recipes
        arrSubCategory.add(Recipes(1,
            "Ugali with Sukuma Wiki",
            "Lunch",
            4,
            "beginner",
            "2 cups maize flour,4 cups water,1 bunch collard greens, Salt to taste",
            "Bring water to a boil in a pot.Add maize flour gradually, stirring continuously to avoid lumps.Keep stirring until the mixture thickens and forms a smooth consistency.Simmer for 15-20 minutes until fully cooked.Serve hot with sautéed collard greens.",R.drawable.img1
        ))
        arrSubCategory.add(Recipes(2,
            "Nyama Choma",
            "Lunch",
            5,
            "intermediate",
            "2 lbs beef or goat meat, cubed,Salt and pepper to taste,1 tablespoon vegetable oil,Skewers for grilling",
            "Marinate the meat with salt, pepper, and oil.Thread the meat onto skewers.Grill over medium heat until cooked to desired doneness.Serve with your favorite side dishes or sauces.",R.drawable.img2
        ))
        arrSubCategory.add(Recipes(3,
            "Githeri",
            "Lunch",
            5,
            "beginner",
            "2 cups maize,2 cups beans,1 onion, chopped,2 tomatoes, diced,Salt and spices to taste",
            "Boil maize and beans until soft.In a separate pan, sauté onions and tomatoes until tender.Add the cooked maize and beans to the sautéed mixture.Season with salt and spices.Simmer for an additional 15-20 minutes.Serve hot.",R.drawable.img3
        ))
        arrSubCategory.add(Recipes(4,
            "Chapo Beans",
            "Lunch",
            4,
            "expert",
            "2 cups all-purpose flour,Water for kneading,1 cup cooked beans,1 onion, chopped,Tomato sauce for serving",
            "Mix flour with water to form a soft dough. Divide the dough into balls and roll out each ball into a flat, round chapati.Cook each chapati on a hot griddle until browned.In a separate pan, sauté onions and mix with cooked beans.Serve chapati with the bean mixture and tomato sauce.",R.drawable.img4
        ))
        arrSubCategory.add(Recipes(5,
            "mandazi",
            "Breakfast",
            8,
            "beginner",
            "2 cups all-purpose flour",
            "1/2 cup sugar,1/2 teaspoon baking powder,1/2 cup coconut milk,Vegetable oil for frying.In a bowl, mix flour, sugar, and baking powder.Add coconut milk to form a soft dough.Roll out the dough and cut it into small, triangular shapes.Heat vegetable oil in a pan and fry the mandazi until golden brown.Serve as a delightful snack.",R.drawable.img5
        ))
        arrSubCategory.add(Recipes(6,
            "Sukuma Wiki Stew",
            "Lunch",
            4,
            "intermediate",
            "1 bunch sukuma wiki (collard greens), chopped,2 tomatoes, diced,1 onion, chopped,2 tablespoons vegetable oil,Spices and salt to taste",
            "Sauté onions in vegetable oil until golden brown.Add diced tomatoes and cook until soft.Add chopped sukuma wiki and spices.Simmer until the greens are tender.Serve as a side dish.",R.drawable.img6
        ))
        arrSubCategory.add(Recipes(7,
            "Irio",
            "Dinner",
            4,
            "intermediate",
            "2 cups green peas, boiled,4 large potatoes, boiled and mashed,1 cup corn kernels, cooked,1 onion, chopped,Gravy for serving",
            "Mix boiled peas, mashed potatoes, cooked corn, and chopped onions in a bowl.Mash the ingredients together until well combined.Serve hot with gravy.",R.drawable.img7
        ))
        arrSubCategory.add(Recipes(8,
            "Pilau",
            "Dinner",
            6,
            "intermediate",
            "2 cups basmati rice,1 lb beef or chicken, cubed,2 onions, finely chopped,2 tomatoes, diced,2 tablespoons pilau masala,Vegetable oil for cooking",
            "In a pan, sauté onions until golden brown.Add diced tomatoes and cook until soft.Add meat cubes and cook until browned.Add pilau masala and stir well.Add rice and cook for a few minutes.Pour in water, cover, and simmer until rice is cooked.Serve hot with your favorite side dishes.",R.drawable.img8
        ))
        arrSubCategory.add(Recipes(9,
            "Masala Chips",
            "Lunch",
            4,
            "intermediate",
            "4 large potatoes, peeled and sliced,1 tablespoon vegetable oil,1 teaspoon chili powder,1 teaspoon cumin powder,Salt to taste",
            "Preheat the oven to 400°F (200°C).In a bowl, toss potato slices with vegetable oil, chili powder, cumin powder, and salt.Spread the seasoned potato slices on a baking sheet.Bake in the preheated oven until golden and crispy.Serve hot as a flavorful snack.",R.drawable.img9
        ))
        arrSubCategory.add(Recipes(10,
            "Samosa",
            "Breakfast",
            8,
            "expert",
            "2 cups all-purpose flour,1/4 cup vegetable oil,1 cup boiled and mashed potatoes,1/2 cup cooked peas,1 teaspoon cumin seeds,1 teaspoon garam masala,Vegetable oil for frying",
            "In a bowl, mix flour and oil to form a crumbly texture.Add water gradually to form a smooth dough.Divide the dough into small balls and roll out each ball into a thin circle.In a separate bowl, mix mashed potatoes, cooked peas, cumin seeds, and garam masala.Place a portion of the filling in the center of each dough circle and fold it into a triangular shape.Seal the edges and deep-fry until golden brown.Serve hot with chutney or sauce.",R.drawable.img10
        ))

        subCategoryAdapter.setData(arrSubCategory)

        binding.rvMainCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMainCategory.adapter = mainCategoryAdapter

        binding.rvSubCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false )
        binding.rvSubCategory.adapter = subCategoryAdapter

        findViewById<RecyclerView>(R.id.rv_sub_category).setOnClickListener {
            var intent = Intent(this@HomePageActivity,SplashPageActivity::class.java)
            startActivity(intent)
            finish()

        }

    }




}