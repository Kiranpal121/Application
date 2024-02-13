package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Report : AppCompatActivity() {

    private lateinit var backbutton : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val binStatusTextView: TextView = findViewById(R.id.binstatusreport)
        val compostifyTextView: TextView = findViewById(R.id.compostreport)
        val sprinkleTextView: TextView = findViewById(R.id.sprinklereport)
        val overallWasteTextView: TextView = findViewById(R.id.wastereport)
        val weatherTextView: TextView = findViewById(R.id.weatherreport)
        val governmentSchemeTextView: TextView = findViewById(R.id.govreport)

        binStatusTextView.setOnClickListener {
            val intent = Intent(this, Binreport::class.java)
            startActivity(intent)
        }

        compostifyTextView.setOnClickListener {
            val intent = Intent(this, Compostreport::class.java)
            startActivity(intent)
        }

        sprinkleTextView.setOnClickListener {
            val intent = Intent(this, sprinklereport::class.java)
            startActivity(intent)
        }

        overallWasteTextView.setOnClickListener {
            val intent = Intent(this, wastemangreport::class.java)
            startActivity(intent)

            weatherTextView.setOnClickListener {
                val intent = Intent(this, Weatherreport::class.java)
                startActivity(intent)
            }

            governmentSchemeTextView.setOnClickListener {
                val intent = Intent(this, govreport::class.java)
                startActivity(intent)

            }

            backbutton.setOnClickListener {
                // Navigate back to the main activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Optional, finish the current activity to prevent going back to it
            }
        }
    }
}
