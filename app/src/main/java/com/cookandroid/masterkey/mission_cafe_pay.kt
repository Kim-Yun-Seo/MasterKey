package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class mission_cafe_pay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_cafe_pay)

        val numberCafeButton: Button = findViewById(R.id.btn7_cafe)
        val cardPayButton: TextView = findViewById(R.id.card_pay_cafe)
        val noPointButton: TextView = findViewById(R.id.etc_pay_cafe)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        backButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_point::class.java)
            startActivity(intent)
        }

        cardPayButton.setOnClickListener {
            var intent = Intent(this, cafe_end_real::class.java)
            startActivity(intent)
        }
    }
}