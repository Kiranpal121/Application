package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Login : AppCompatActivity() {

    private lateinit var  loginusername: EditText
    private lateinit var  loginpassword: EditText
    private lateinit var  loginbutton:Button
    private lateinit var question:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginusername = findViewById(R.id.loginusername)
        loginpassword = findViewById(R.id.loginpassword)
        loginbutton = findViewById(R.id.loginbutton)


        val questionTextView: TextView = findViewById(R.id.question)
        questionTextView.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)

        }
            loginbutton.setOnClickListener {
                val username = loginusername.text.toString()
                val password = loginpassword.text.toString()

                if (isValidLogin(username, password)) {

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                }
                else
                {

                }
            }
        }

        private fun isValidLogin(username: String, password: String): Boolean {
            return username.isNotEmpty() && password.isNotEmpty()
        }
    }