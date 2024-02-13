package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class wastemangreport : AppCompatActivity() {

    private lateinit var backbutton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wastemangreport)

        backbutton = findViewById(R.id.backButton2)


        backbutton.setOnClickListener {
            // Navigate back to the main activity
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
            finish() // Optional, finish the current activity to prevent going back to it


        }
    }
}