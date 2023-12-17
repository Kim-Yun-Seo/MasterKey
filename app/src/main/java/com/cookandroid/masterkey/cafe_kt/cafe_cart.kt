package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView



class cafe_cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_cart)

        val numberCafeButton: Button = findViewById(R.id.btn7_cafe)
        val resultTextView: TextView = findViewById(R.id.payAmount_cafe)
        val text8: TextView = findViewById(R.id.text8)
        val text9: TextView = findViewById(R.id.text9)
        val firstMenu: ImageView = findViewById(R.id.firstMenu_cafe)
        val secondMenu: ImageView = findViewById(R.id.secondMenu_cafe)
        val cafeBox1: ImageView = findViewById(R.id.cafe_box1)
        val cafeBox2: ImageView = findViewById(R.id.cafe_box2)
        val cancelButton: TextView = findViewById(R.id.cancel_button_cafe)
        val toPayButton: ImageView = findViewById(R.id.payBtn)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        backButton.setOnClickListener {
            var intent = Intent(this, cafe_main::class.java)
            startActivity(intent)
        }

        numberCafeButton.setOnClickListener {
            changeText(resultTextView)
        }

        toPayButton.setOnClickListener {
            var intent = Intent(this, cafe_point::class.java)
            startActivity(intent)
        }

        cancelButton.setOnClickListener {
            menuCancel(firstMenu)
            menuCancel(secondMenu)
            menuTextCancel(text8)
            menuTextCancel(text9)
            cartBoxCancel(cafeBox1)
            cartBoxCancel(cafeBox2)
        }

    }
    private fun changeText(textView: TextView) {
        textView.text = "20"
    }

    private fun menuCancel(imageView: ImageView) {
        imageView.visibility = View.INVISIBLE
    }

    private fun menuTextCancel(textView: TextView) {
        textView.visibility = View.INVISIBLE
    }

    private fun cartBoxCancel(imageView: ImageView) {
        imageView.setImageResource(R.drawable.cafe_box)
    }

}