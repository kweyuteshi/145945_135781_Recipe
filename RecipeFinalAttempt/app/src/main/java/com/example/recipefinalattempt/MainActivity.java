package com.example.recipefinalattempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView myrecyclerView = findViewById(R.id.recyclerView_id);
        List<Recipes> recipes1;

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",R.drawable.img1));

        recipes1.add(new Recipes("Masala Chips","4 large potatoes, peeled and sliced\n" +
                "1 tablespoon vegetable oil\n" +
                "1 teaspoon chili powder\n" +
                "1 teaspoon cumin powder\n" +
                "Salt to taste","Method","Preheat the oven to 400°F (200°C).In a bowl, toss potato slices with vegetable oil, chili powder, cumin powder, and salt. Spread the seasoned potato slices on a baking sheet. Bake in the preheated oven until golden and crispy.Serve hot as a flavorful snack.\n",R.drawable.img2));

        recipes1.add(new Recipes("Kenyan Pilau","2 cups basmati rice\n" +
                "1 lb beef or chicken, cubed\n" +
                "2 onions, finely chopped\n" +
                "2 tomatoes, diced\n" +
                "2 tablespoons pilau masala\n" +
                "Vegetable oil for cooking","Method","Spiced rice dish often cooked with meat and vegetables. In a pan, sauté onions until golden brown.Add diced tomatoes and cook until soft. Add meat cubes and cook until browned.Add pilau masala and stir well. Add rice and cook for a few minutes. Pour in water, cover, and simmer until rice is cooked.Serve hot with your favorite side dishes.\n",R.drawable.img3));


        recipes1.add(new Recipes("Irio","2 cups green peas, boiled\n" +
                "4 large potatoes, boiled and mashed\n" +
                "1 cup corn kernels, cooked\n" +
                "1 onion, chopped\n" +
                "Gravy for serving","Method","Mashed peas and potatoes mixed with corn and sometimes topped with gravy.Mix boiled peas, mashed potatoes, cooked corn, and chopped onions in a bowl. Mash the ingredients together until well combined.Serve hot with gravy.\n",R.drawable.img4));


        recipes1.add(new Recipes("Chapati with Beans","\"2 cups all-purpose flour\",\n" +
                "        \"Water for kneading\",\n" +
                "        \"1 cup cooked beans\",\n" +
                "        \"1 onion, chopped\",\n" +
                "        \"Tomato sauce for serving\"","Method","Mix flour with water to form a soft dough. Divide the dough into balls and roll out each ball into a flat, round chapati. Cook each chapati on a hot griddle until browned. In a separate pan, sauté onions and mix with cooked beans. Serve chapati with the bean mixture and tomato sauce.\"\n",R.drawable.img5));
       /* recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",));
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",));
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",));
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",));
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sukuma Wiki Omelette","4 eggs\n" +
                "1/2 cup sukuma wiki, chopped\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon butter","Method","A delicious omelette with sukuma wiki (collard greens) filling. Whisk eggs in a bowl and season with salt and pepper. Sauté chopped sukuma wiki in butter until wilted. Pour whisked eggs over sukuma wiki and cook until set. Fold the omelette and serve hot.\n",));*/





        myrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myrecyclerView.setAdapter(new RecyclerViewAdapter(getApplicationContext(),recipes1));
    }
}