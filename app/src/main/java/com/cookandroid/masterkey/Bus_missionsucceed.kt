package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bus_missionsucceed : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_missionsucceed)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)


        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity_playmode::class.java)
            startActivity(intent)

        }
        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity_second::class.java)
            startActivity(intent)

        }

    }

}