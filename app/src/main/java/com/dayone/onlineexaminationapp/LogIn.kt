package com.dayone.onlineexaminationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        // button func into sign in
        val signinbutton = findViewById<Button>(R.id.signinbtn)
        val loginbutton = findViewById<Button>(R.id.loginbtn)

        signinbutton.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

// button function in student or teacher
       loginbutton.setOnClickListener {
            val intent = Intent(this, studentorteacher::class.java)
            startActivity(intent)
        }







    }
}