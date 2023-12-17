package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class cafe_end_real_play : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_end_real_play)

        val goTohomeButton: AppCompatButton = findViewById(R.id.goToHome)
        val kioskAgain: AppCompatButton = findViewById(R.id.kioskAgain)

        goTohomeButton.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
        kioskAgain.setOnClickListener {
            var intent = Intent(this, MainActivity_playmode::class.java)
            startActivity(intent)
        }
    }

    private fun changeText(textView: TextView) {
        textView.text = "20"
    }

}