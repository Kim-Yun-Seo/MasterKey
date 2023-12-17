package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class hospital_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_4)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        val btn_hospital1 = findViewById<ImageButton>(R.id.btn_hospital1)
        val btn_hospital2 = findViewById<ImageButton>(R.id.btn_hospital2)
        val btn_hospital3 = findViewById<ImageButton>(R.id.btn_hospital3)
        val btn_hospital4 = findViewById<ImageButton>(R.id.btn_hospital4)
        val btn_back = findViewById<Button>(R.id.btn_back)
        val btn_next = findViewById<Button>(R.id.btn_next)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, hospital_3::class.java)
            startActivity(intent)
            finish()
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }
        btn_hospital1.setOnClickListener{
            val intent = Intent(this, hospital_5::class.java)
            startActivity(intent)
            finish()
        }
        btn_hospital2.setOnClickListener{
            val intent = Intent(this, hospital_5::class.java)
            startActivity(intent)
            finish()
        }
        btn_hospital3.setOnClickListener{
            val intent = Intent(this, hospital_5::class.java)
            startActivity(intent)
            finish()
        }
        btn_hospital4.setOnClickListener{
            val intent = Intent(this, hospital_5::class.java)
            startActivity(intent)
            finish()
        }
        btn_back.setOnClickListener {
            //세 번째 화면으로 이동
            val intent = Intent(this, hospital_3::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }
        btn_next.setOnClickListener {
            // 다섯 번째 화면으로 이동
            val intent = Intent(this, hospital_5::class.java)
            startActivity(intent)
            finish()
        }

    }
}