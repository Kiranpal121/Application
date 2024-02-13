package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class BinSatus : AppCompatActivity() {

    private lateinit var binStatusTextView: TextView
    private lateinit var changeStatusButton: Button
    private lateinit var backbutton :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bin_satus)

        binStatusTextView = findViewById(R.id.binStatusTextView)
        changeStatusButton = findViewById(R.id.changeStatusButton)
        backbutton = findViewById(R.id.backButton)


        backbutton.setOnClickListener {
            // Navigate back to the main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional, finish the current activity to prevent going back to it
        }

        // Set OnClickListener for the button
        changeStatusButton.setOnClickListener {
            // Update bin status when the button is clicked
            // Call a method to determine the bin status and update the TextView
            val status = determineBinStatus()
            binStatusTextView.text = "Bin Status: $status"
        }
    }

    private fun determineBinStatus(): String {
        // Your logic to determine the bin status (e.g., based on some conditions or data)
        // For demonstration purposes, let's assume a random status is returned
        val randomStatus = (0..2).random() // 0 for Empty, 1 for Full, 2 for 50% Full
        return when (randomStatus) {
            0 -> "Empty"
            1 -> "Full"
            2 -> "50% Full"
            else -> "Unknown"
        }
    }
}
