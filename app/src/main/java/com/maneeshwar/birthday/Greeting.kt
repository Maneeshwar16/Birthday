package com.maneeshwar.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.util.Locale
import java.util.Locale.*

class Greeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val greeting: TextView = findViewById(R.id.Greeting)
        val name = intent.getStringExtra("name")
        val language = getDefault().language
        greeting.text = if (language == "en") {
            "Happy Birthday\n$name!!"
        } else {
            "పుట్టిన రోజు శుభాకాంక్షలు\n$name!!"
        }
    }
}