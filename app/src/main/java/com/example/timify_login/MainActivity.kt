package com.example.timify_login

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var switchToSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var username = findViewById<EditText>(R.id.edt_username)
        var password = findViewById<EditText>(R.id.edt_password)


        switchToSecondActivity = findViewById<Button>(R.id.btnLogin)
        switchToSecondActivity.setOnClickListener {

            if(username.text.isEmpty() && password.text.isEmpty())
            {
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show()

            } else if (username.text.isEmpty() || password.text.isEmpty())
            {

                Toast.makeText(this, "Please fill in login details", Toast.LENGTH_SHORT).show()

            } else {

                switchActivities()

            }


        }


        setupHyperlink()
    }

    private fun switchActivities() {
        val switchActivityIntent = Intent(this, HomePage::class.java)
        startActivity(switchActivityIntent)


    }

    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.txt_signUp)
        linkTextView.setTextColor(Color.BLUE)
        linkTextView.setOnClickListener {
            val switchActivityIntent = Intent(this, RegisterPage::class.java)
            startActivity(switchActivityIntent)
        }
    }
}