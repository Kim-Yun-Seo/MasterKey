package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity_playmode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_playmode)

        val btn_play_cafe = findViewById<ImageButton>(R.id.IB_main_3_cafe)
        val btn_play_bus = findViewById<ImageButton>(R.id.IB_main_3_bus)
        val btn_play_cgv = findViewById<ImageButton>(R.id.IB_main_3_cgv)
        val btn_play_hospital = findViewById<ImageButton>(R.id.IB_main_3_hospital)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_second::class.java)
            startActivity(intent)
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_second::class.java)
            startActivity(intent)
        }

        //cafe 실전모드 첫화면 연결
        btn_play_cafe.setOnClickListener {
            // Create an Intent to start the BusActivity
            val intent = Intent(this, MainActivity_mission_cgv_start::class.java)
            startActivity(intent)
        }
        //bus 실전모드 첫화면 연결
        btn_play_bus.setOnClickListener {
            val intent = Intent(this, MainActivity_mission_cgv_start::class.java)
            startActivity(intent)
        }
        //cgv 실전모드 첫화면 연결
        btn_play_cgv.setOnClickListener {
            val intent = Intent(this, MainActivity_mission_cgv_start::class.java)
            startActivity(intent)
        }
        //hosptial 실전모드 첫화면 연결
        btn_play_hospital.setOnClickListener {
            val intent = Intent(this, MainActivity_mission_cgv_start::class.java)
            startActivity(intent)
        }
    }
}