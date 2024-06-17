package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class Bus6_mission : AppCompatActivity() {
    private val DELAY_TIME: Long = 3000 // 3초 대기 시간
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus6_mission)
        Handler().postDelayed({
            val intent = Intent(this@Bus6_mission, Bus_missionsucceed::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }, DELAY_TIME)

        val home = findViewById<ImageView>(R.id.home)
        val btnreq = findViewById<Button>(R.id.request)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus5_mission::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent(this, MainActivity_practicemode::class.java)
            startActivity(intent)
        }
        btnreq.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
            //Tool

            // 5초 후 MainActivitySecond로 전
        }
    }
}
