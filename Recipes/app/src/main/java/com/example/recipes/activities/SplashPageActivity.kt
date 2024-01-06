package com.example.recipes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.recipes.R
import com.example.recipes.fragments.HomeFragment

class SplashPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<Button>(R.id.btnWelcome).setOnClickListener {
            var intent = Intent(this@SplashPageActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}