package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class cafe_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe_main)

        val americanoButton: ImageView = findViewById(R.id.imageButton1_cafe)
        val peanutButton: ImageView = findViewById(R.id.imageButton3_cafe)
        val cancelButton: TextView = findViewById(R.id.cancel_button_cafe)
        val totalPrice: TextView = findViewById(R.id.payAmount_cafe)
        val firstBox: ImageView = findViewById(R.id.cafe_box1)
        val secondBox: ImageView = findViewById(R.id.cafe_box2)
        val toPayButton: ImageView = findViewById(R.id.payBtn)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)
        val btn1Cafe: AppCompatButton = findViewById(R.id.btn1_cafe)
        val btn2Cafe: AppCompatButton = findViewById(R.id.btn2_cafe)
        val gridLayout: GridLayout = findViewById(R.id.bigGridLayout_cafe)
        val gridLayout2: GridLayout = findViewById(R.id.bigGridLayout_cafe2)

        // Tool bar back button
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity_practicemode::class.java)
            startActivity(intent)
            finish()
        }

        // Tool bar Home Button
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }


        americanoButton.setOnClickListener {
            // 클릭 시 수행할 동작
            changeText(totalPrice)
            changeFirstMenu(firstBox)
        }
        peanutButton.setOnClickListener {
            // 클릭 시 수행할 동작
            changeText2(totalPrice)
            changeSecondMenu(secondBox)
        }

        cancelButton.setOnClickListener {
            cancelMenu(firstBox)
            cancelMenu(secondBox)
            cancelPrice(totalPrice)
        }

        toPayButton.setOnClickListener {
            var intent = Intent(this, cafe_cart::class.java)

            startActivity(intent)
        }

        btn1Cafe.setOnClickListener {
            gridOut(gridLayout2)
            gridIn(gridLayout)
        }

        btn2Cafe.setOnClickListener {
            gridOut(gridLayout)
            gridIn(gridLayout2)
        }


    }
    private fun changeText(textView: TextView) {
        textView.text = "₩3200"
    }
    private fun changeText2(textView: TextView) {
        textView.text = "₩7400"
    }

    private fun changeFirstMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.ame_change_cafe)
    }

    private fun changeSecondMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.change_peanut_cafe)
    }

    private fun cancelMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.cafe_box)
    }

    private fun cancelPrice(textView: TextView) {
        textView.text = "₩0"
    }

    private fun gridOut(gridLayout: GridLayout) {
        gridLayout.visibility = View.INVISIBLE
    }

    private fun gridIn(gridLayout: GridLayout) {
        gridLayout.visibility = View.VISIBLE
    }



}