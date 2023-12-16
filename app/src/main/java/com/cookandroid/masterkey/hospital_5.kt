package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class hospital_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_5)

        val backToFirstbtn = findViewById<Button>(R.id.backToFirstbtn)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, hospital_4::class.java)
            startActivity(intent)
            finish()
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }

        backToFirstbtn.setOnClickListener{
            val intent = Intent(this, hospital_1::class.java)
            startActivity(intent)
            finish()
        }

    }
}