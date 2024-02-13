package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


private lateinit var backbutton : ImageView
class Binreport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binreport)



        backbutton = findViewById(R.id.backButton)


        backbutton.setOnClickListener {
            // Navigate back to the main activity
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
            finish() // Optional, finish the current activity to prevent going back to it
        }
    }
}