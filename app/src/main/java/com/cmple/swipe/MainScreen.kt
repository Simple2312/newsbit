package com.cmple.swipe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cmple.swipe.newsapp.MainActivity


class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_main)

        // get reference to ImageView
        val news = findViewById(R.id.SplashScreenImage) as ImageView
        // set on-click listener
        news.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainScreen, "GoodDay!!!", Toast.LENGTH_SHORT).show()
        }


        //explore


        //snips

        val button1 = findViewById<Button>(R.id.materialButton4)
        button1.setOnClickListener{
            val intent = Intent(this,MainActivity1::class.java)
            startActivity(intent)
        }
        //news
        val button2 = findViewById<Button>(R.id.materialButton5)
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
       }
        val button3 = findViewById(R.id.materialButton6) as Button
        // set on-click listener
        button3.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainScreen, "wip!!! Developed at synergy institute of technology BBSR", Toast.LENGTH_SHORT).show()
        }


    }
}
