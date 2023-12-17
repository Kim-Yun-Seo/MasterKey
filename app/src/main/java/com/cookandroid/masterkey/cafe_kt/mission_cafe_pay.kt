package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class mission_cafe_pay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_cafe_pay)

        val numberCafeButton: Button = findViewById(R.id.btn7_cafe)
        val cardPayButton: TextView = findViewById(R.id.card_pay_cafe)
        val etcPayButton: TextView = findViewById(R.id.etc_pay_cafe)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        etcPayButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_pay)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("카드 결제를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        backButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_point::class.java)
            startActivity(intent)
        }

        homeButton.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

        cardPayButton.setOnClickListener {
            var intent = Intent(this, cafe_end_real_play::class.java)
            startActivity(intent)
        }
    }
}