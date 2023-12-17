package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class cafe_end_real : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_end_real)

        val goTohomeButton: AppCompatButton = findViewById(R.id.goToHome)

        goTohomeButton.setOnClickListener {
            var intent = Intent(this, cafe_main::class.java)
            startActivity(intent)
        }
    }

    private fun changeText(textView: TextView) {
        textView.text = "20"
    }

}