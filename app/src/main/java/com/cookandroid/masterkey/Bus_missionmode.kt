package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Bus_missionmode : AppCompatActivity() {
    lateinit var MissionStart : ImageView
    lateinit var Home : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_missionmode_bus)

        val MissionStart: ImageView = findViewById(R.id.btn_mission_start)
        val Home: ImageView = findViewById(R.id.btn_home)

        MissionStart.setOnClickListener {
            // Handle the click on mission start button
            val intent = Intent(this, Bus1_mission::class.java)
            startActivity(intent)
        }

        Home.setOnClickListener {
            // Handle the click on home button
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
    }
}
