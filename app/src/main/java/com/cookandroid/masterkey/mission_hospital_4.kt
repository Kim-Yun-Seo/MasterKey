package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class mission_hospital_4 : AppCompatActivity() {
    lateinit var btn_hospital1 : ImageButton; lateinit var btn_hospital2 : ImageButton;
    lateinit var btn_hospital3 : ImageButton; lateinit var btn_hospital4 : ImageButton;
    lateinit var btn_back : Button; lateinit var btn_next : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_hospital4)
        btn_hospital1 = findViewById<ImageButton>(R.id.btn_hospital1)
        btn_hospital2 = findViewById<ImageButton>(R.id.btn_hospital2)
        btn_hospital3 = findViewById<ImageButton>(R.id.btn_hospital3)
        btn_hospital4 = findViewById<ImageButton>(R.id.btn_hospital4)
        btn_back = findViewById<Button>(R.id.btn_back)
        btn_next = findViewById<Button>(R.id.btn_next)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, mission_hospital_3::class.java)
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
            val intent = Intent(this, mission_hospital_5::class.java)
            startActivity(intent)
            finish()
        }
        btn_hospital2.setOnClickListener{
            var dlg= AlertDialog.Builder(this@mission_hospital_4)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("김똑딱 원장님으로 접수해주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }
        btn_hospital3.setOnClickListener{
            var dlg= AlertDialog.Builder(this@mission_hospital_4)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("김똑딱 원장님으로 접수해주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }
        btn_hospital4.setOnClickListener{
            var dlg= AlertDialog.Builder(this@mission_hospital_4)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("김똑딱 원장님으로 접수해주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        btn_back.setOnClickListener {
            //세 번째 화면으로 이동
            val intent = Intent(this, mission_hospital_3::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }

        btn_next.setOnClickListener {
            // 다섯 번째 화면으로 이동
            val intent = Intent(this, mission_hospital_5::class.java)
            startActivity(intent)
            finish()
        }
    }
}