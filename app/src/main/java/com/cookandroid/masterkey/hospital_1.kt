package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class hospital_1 : AppCompatActivity() {
    lateinit var textTop1: TextView
    lateinit var textView2: TextView
    lateinit var btnAccept: ImageButton
    lateinit var btnPayment: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_1)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        textTop1 = findViewById<TextView>(R.id.textTop1)
        textView2 = findViewById<TextView>(R.id.textView2)
        btnAccept = findViewById<ImageButton>(R.id.btnAccept)
        btnPayment = findViewById<ImageButton>(R.id.btnPayment)

        btnAccept.setOnClickListener {
            var intent = Intent(applicationContext, hospital_2::class.java)
            startActivity(intent)
            finish()
        }
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_practicemode::class.java) //키오스크 고르는 화면으로 되돌아기
            startActivity(intent)
            finish()
        }

        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }
    }

}