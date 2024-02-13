package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Signup : AppCompatActivity() {

    private lateinit var signupusername :EditText
    private lateinit var signuppassword:EditText
    private lateinit var signupbutton:Button
    private lateinit var question2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signupusername = findViewById(R.id.signupusername)
        signuppassword = findViewById(R.id.signuppassword)
        signupbutton = findViewById(R.id.signupbutton)
        question2 = findViewById(R.id.question)

        signupbutton.setOnClickListener{
            val username = signupusername.text.toString()
            val password = signuppassword.text.toString()

            if (isValidSignup(username, password)) {

                val intent = Intent(this,Login::class.java)
                startActivity(intent)

            } else {
            }
        }
        question2.setOnClickListener {
            val intent =Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
    private fun isValidSignup(username: String, password: String): Boolean {
        // Perform signup validation logic here
        // For example, check if the username and password meet certain criteria
        return username.isNotEmpty() && password.isNotEmpty()
    }
}