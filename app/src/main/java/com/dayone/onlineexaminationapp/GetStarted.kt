package com.dayone.onlineexaminationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.get_started)


// get started func button
        val getstartedbutton = findViewById<Button>(R.id.btngetstarted)

        getstartedbutton.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }









    }
}