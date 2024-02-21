package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Sprinkle : AppCompatActivity() {

    private lateinit var backbutton : ImageView
    private lateinit var message : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sprinkle)

        backbutton = findViewById(R.id.backButton2)
        message = findViewById(R.id.message)

        val shouldWater = true // or false based on your logic

        if (shouldWater) {
            message.text = "You should water the Bin."
        } else {
            message.text = "No need to water the Bin."
        }


        backbutton.setOnClickListener {
            // Navigate back to the main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional, finish the current activity to prevent going back to it
        }
    }
}