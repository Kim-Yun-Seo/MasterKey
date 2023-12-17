package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_second : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        val btn_practice = findViewById<Button>(R.id.practice)
        val btn_playmode = findViewById<Button>(R.id.playmode)

        btn_practice.setOnClickListener {
            // Create an Intent to start the BusActivity
            val intent = Intent(this, MainActivity_practicemode::class.java) //키오스크 고르는 화면으로 되돌아기
            startActivity(intent)
        }

        btn_playmode.setOnClickListener {
            val intent = Intent(this, MainActivity_playmode::class.java)
            startActivity(intent)
        }
    }
}