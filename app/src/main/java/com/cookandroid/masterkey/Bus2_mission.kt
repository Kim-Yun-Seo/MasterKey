package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class Bus2_mission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus2_mission)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus1_mission::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_playmode::class.java)
            startActivity(intent)
        }//Tool

        val btnbtnnebus = findViewById<Button>(R.id.btnnebus)
        val btnyesbus = findViewById<Button>(R.id.btnyesbus)

        btnbtnnebus.setOnClickListener {
            var dlg= AlertDialog.Builder(this@Bus2_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("도착지 선택을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        btnyesbus.setOnClickListener {
            var dlg= AlertDialog.Builder(this@Bus2_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("도착지 선택을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        val desBusButton = findViewById<Button>(R.id.desbus)
        desBusButton.setOnClickListener {
            val intent = Intent(this, Bus3_mission::class.java)
            startActivity(intent)
        }
    }
}