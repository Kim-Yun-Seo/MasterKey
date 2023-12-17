package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class mission_hospital_start : AppCompatActivity() {
    lateinit var btn_missionstart : ImageButton
    lateinit var btn_gobackhome : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_hospital_start)

        btn_missionstart = findViewById<ImageButton>(R.id.btn_missionstart)
        btn_gobackhome = findViewById<ImageButton>(R.id.btn_gobackhome)

        btn_missionstart.setOnClickListener{
            val intent = Intent(this, mission_hospital_1::class.java)
            startActivity(intent)
            finish()
        }
        btn_gobackhome.setOnClickListener({
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        })
    }
}