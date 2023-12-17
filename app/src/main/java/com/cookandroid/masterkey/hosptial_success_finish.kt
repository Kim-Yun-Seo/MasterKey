package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class hosptial_success_finish : AppCompatActivity() {
    lateinit var btnGoBackKiosk : Button
    lateinit var btnGoHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hosptial_success_finish)
        btnGoBackKiosk = findViewById<Button>(R.id.btnGoBackKiosk)
        btnGoHome = findViewById<Button>(R.id.btnGoHome)


        //키오스크로 돌아가는 intent
        btnGoBackKiosk.setOnClickListener{
            val intent = Intent(this, MainActivity_playmode::class.java)
            startActivity(intent)
            finish()
        }
        btnGoHome.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }

    }

}