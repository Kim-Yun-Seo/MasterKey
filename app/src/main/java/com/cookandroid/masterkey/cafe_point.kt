package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class cafe_point : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_point)

        val numberCafeButton: Button = findViewById(R.id.btn7_cafe)
        val numberPointButton: TextView = findViewById(R.id.number_cafe)
        val noPointButton: TextView = findViewById(R.id.no_point_cafe)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        // Tool bar back button
        backButton.setOnClickListener {
            val intent = Intent(this, cafe_cart::class.java)
            startActivity(intent)
            finish()
        }

        // Tool bar Home Button
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }

        noPointButton.setOnClickListener {
            var intent = Intent(this, cafe_pay::class.java)
            startActivity(intent)
        }

    }

}