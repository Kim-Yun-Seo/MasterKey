package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class mission_hospital_1 : AppCompatActivity() {
    lateinit var textTop1 : TextView
    lateinit var textView2 : TextView
    lateinit var btnAccept : ImageButton
    lateinit var btnPayment : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_hospital_1)

        textTop1 = findViewById<TextView>(R.id.textTop1)
        textView2 = findViewById<TextView>(R.id.textView2)
        btnAccept = findViewById<ImageButton>(R.id.btnAccept)
        btnPayment = findViewById<ImageButton>(R.id.btnPayment)

        btnAccept.setOnClickListener{
            var intent = Intent(applicationContext, mission_hospital_2::class.java)
            startActivity(intent)
            finish()
        }
        btnPayment.setOnClickListener{
            var dlg=AlertDialog.Builder(this@mission_hospital_1)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("접수하기 버튼을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, mission_hospital_start::class.java)
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