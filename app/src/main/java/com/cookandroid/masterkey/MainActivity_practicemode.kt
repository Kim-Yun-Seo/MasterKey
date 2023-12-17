package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity_practicemode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_practicemode)
        val btn_practice_cafe = findViewById<ImageButton>(R.id.IB_main_3_cafe)
        val btn_practice_bus = findViewById<ImageButton>(R.id.IB_main_3_bus)
        val btn_practice_cgv = findViewById<ImageButton>(R.id.IB_main_3_cgv)
        val btn_practice_hospital = findViewById<ImageButton>(R.id.IB_main_3_hospital)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

        //cafe 연습모드 첫화면 연결
        btn_practice_cafe.setOnClickListener {
            // Create an Intent to start the BusActivity
            val intent = Intent(this, cafe_main::class.java)
            startActivity(intent)
        }
        //bus 연습모드 첫화면 연결
        btn_practice_bus.setOnClickListener {
            val intent = Intent(this, Bus1::class.java)
            startActivity(intent)
        }
        //cgv 연습모드 첫화면 연결
        btn_practice_cgv.setOnClickListener {
            val intent = Intent(this, cgv1::class.java)
            startActivity(intent)
        }
        //hosptial 연습모드 첫화면 연결
        btn_practice_hospital.setOnClickListener {
            val intent = Intent(this, hospital_1::class.java)
            startActivity(intent)
        }
    }
}