package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Weatherreport : AppCompatActivity() {

    private lateinit var backbutton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weatherreport)

        // Initialize views
        backbutton = findViewById(R.id.backButton2)

        // Set click listener for back button
        backbutton.setOnClickListener {
            // Navigate back to the main activity
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
            finish() // Optional, finish the current activity to prevent going back to it
        }

        // Display weather information
        displayWeatherInformation()
    }

    private fun displayWeatherInformation() {
        // Generate random weather information
        val weatherCondition = generateRandomWeatherCondition()
        val temperature = generateRandomTemperature()
        val weatherDescription = generateRandomWeatherDescription()

        // Update TextViews with weather information
        findViewById<TextView>(R.id.weatherConditionTextView).text = "Weather Condition: $weatherCondition"
        findViewById<TextView>(R.id.weatherTemperatureTextView).text = "Temperature: $temperature°C"
        findViewById<TextView>(R.id.weatherDescriptionTextView).text = "Description: $weatherDescription"
    }

    private fun generateRandomWeatherCondition(): String {
        val conditions = listOf("Wet", "Dry", "Full", "Pest")
        return conditions.random()
    }

    private fun generateRandomTemperature(): Int {
        return Random.nextInt(-20, 41) // Random temperature between -20°C and 40°C
    }

    private fun generateRandomWeatherDescription(): String {
        val descriptions = listOf(
            "Too much wet",
            "Too dry",
            "Garbage has been tightly packed or compressed within the bin.",
            "Garbage contains pests or insects such as flies, maggots, or rodents."
        )
        return descriptions.random()
    }
}
