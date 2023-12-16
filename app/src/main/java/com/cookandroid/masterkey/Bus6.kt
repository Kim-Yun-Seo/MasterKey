package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Bus6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus6)


        val home = findViewById<ImageView>(R.id.home)
        val btnreq = findViewById<Button>(R.id.request)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_practicemode::class.java)
            startActivity(intent)
        }
        home.setOnClickListener{
            val intent = Intent(this,MainActivity_practicemode::class.java)
            startActivity(intent)
        }
        btnreq.setOnClickListener{
            val intent = Intent(this,Bus5::class.java)
            startActivity(intent)
        }//Tool

        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)
        val lastClickedButton = sharedPreferences.getString("lastClickedButton", "기본값")

        // 목적지 텍스트 설정
        val realdesTextView = findViewById<TextView>(R.id.realdes)
        realdesTextView.text = lastClickedButton

        // Bus5Activity에서 총 가격 가져오기
        val totalPrice = intent.getDoubleExtra("totalPrice", 0.0) // 찾을 수 없을 경우의 기본값으로 0.0을 대체하세요
        val priceTextView = findViewById<TextView>(R.id.price)
        priceTextView.text = totalPrice.toString()
    }
}