package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class mission_cafe_first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_cafe_first)

        val missionBtn: ImageButton = findViewById(R.id.btn_missionstart)
        val goToHome: ImageButton = findViewById(R.id.btn_goToHome)

        missionBtn.setOnClickListener {
            var intent = Intent(this, mission_cafe_main::class.java)
            startActivity(intent)
        }

        goToHome.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
    }

}