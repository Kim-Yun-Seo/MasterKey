package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class mission_cafe_point : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_cafe_point)

        val numberCafeButton: Button = findViewById(R.id.btn7_cafe)
        val numberPointButton: TextView = findViewById(R.id.number_cafe)
        val barcodePointButton: TextView = findViewById(R.id.barcode_cafe)
        val noPointButton: TextView = findViewById(R.id.no_point_cafe)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        numberPointButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_point)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("적립 안 함을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        barcodePointButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_point)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("적립 안 함을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        backButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_cart::class.java)
            startActivity(intent)
        }

        noPointButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_pay::class.java)
            startActivity(intent)
        }

        homeButton.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

    }

}