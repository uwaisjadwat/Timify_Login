package com.example.timify_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterPage : AppCompatActivity() {
    private lateinit var switchToSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)


        var username = findViewById<EditText>(R.id.reg_username)
        var password = findViewById<EditText>(R.id.reg_password)

        switchToSecondActivity = findViewById<Button>(R.id.btnLogin)
        switchToSecondActivity.setOnClickListener {

            if(username.text.isEmpty() && password.text.isEmpty())
            {
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show()

            } else if (username.text.isEmpty() || password.text.isEmpty())
            {

                Toast.makeText(this, "Please fill in your details", Toast.LENGTH_SHORT).show()

            } else {

                switchActivities()

            }



        }




    }

    private fun switchActivities() {
        val switchActivityIntent = Intent(this, HomePage::class.java)
        startActivity(switchActivityIntent)


    }
}