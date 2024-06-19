package com.maneeshwar.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1(view: View){
        val inputt = findViewById<EditText>(R.id.inputt)
        val name=inputt.text.toString()
        val intent=Intent(this,Greeting::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }

}