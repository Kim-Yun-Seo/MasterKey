package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Bus1_mission : AppCompatActivity() {

     lateinit var btnLeft: ImageView
     lateinit var tvCenter: TextView
     lateinit var btnRight: ImageView
     lateinit var bus1: Button
     lateinit var bus2: Button
     lateinit var bus3: Button
     lateinit var korbus: Button
     lateinit var engbus: Button
     lateinit var chibus: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus1_mission)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        btnLeft = findViewById(R.id.btnLeft)
        btnRight = findViewById(R.id.btnRight)
        bus1 = findViewById(R.id.bus1)
        bus2 = findViewById(R.id.bus2)
        bus3 = findViewById(R.id.bus3)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus_missionmode::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

        bus1.setOnClickListener {
            val intent = Intent(this, Bus2_mission::class.java)
            startActivity(intent)

        }

        bus2.setOnClickListener {
            var dlg= AlertDialog.Builder(this@Bus1_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("승차권 구매 버튼을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        bus3.setOnClickListener {
            var dlg= AlertDialog.Builder(this@Bus1_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("승차권 구매 버튼을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }


        // ... (rest of your code)
    }
}