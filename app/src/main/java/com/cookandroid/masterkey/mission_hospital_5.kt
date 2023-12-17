package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class mission_hospital_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_hospital5)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        val btnTosuccess = findViewById<Button>(R.id.btnTosuccess)

        // Tool bar Back Button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, mission_hospital_4::class.java)
            startActivity(intent)
            finish()
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }
        //
        btnTosuccess.setOnClickListener{
            val intent = Intent(this, hosptial_success_finish::class.java)
            startActivity(intent)
            finish()
        }
    }
}