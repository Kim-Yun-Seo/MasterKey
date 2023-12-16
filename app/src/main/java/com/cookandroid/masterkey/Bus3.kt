package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TableLayout

class Bus3 : AppCompatActivity(), View.OnClickListener {

    private lateinit var tableLayout1: TableLayout
    private lateinit var tableLayout2: TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus3)
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus2_mission::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_practicemode::class.java)
            startActivity(intent)
        }//Tool

        // Find your TableLayouts
        tableLayout1 = findViewById(R.id.tableLayout1)
        tableLayout2 = findViewById(R.id.tableLayout2)

        // Find your buttons
        val btnAllBus: Button = findViewById(R.id.btnall_bus)
        val btnSeoulBus: Button = findViewById(R.id.btnseoul_bus)
        val seoulBtn1: Button = findViewById(R.id.seoul_btn1) // Assuming this is the "센트럴 시티" button

        // Set click listeners
        btnAllBus.setOnClickListener(this)
        btnSeoulBus.setOnClickListener(this)
        seoulBtn1.setOnClickListener(this)
    }
    fun onButtonClick(view: View) {
        // 사용자가 클릭한 버튼의 텍스트 가져오기
        val clickedButtonText = (view as Button).text.toString()

        // SharedPreferences를 사용하여 마지막으로 누른 버튼의 텍스트 저장
        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("lastClickedButton", clickedButtonText)
        editor.apply()

        // Intent에 텍스트 추가하고 Bus6Activity로 이동
        val intent = Intent(this, Bus6::class.java)
        startActivity(intent)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnall_bus -> {
                // Show the first TableLayout and hide the second TableLayout
                tableLayout1.visibility = View.VISIBLE
                tableLayout2.visibility = View.GONE
            }

            R.id.btnseoul_bus -> {
                // Show the second TableLayout and hide the first TableLayout
                tableLayout1.visibility = View.GONE
                tableLayout2.visibility = View.VISIBLE
            }

            R.id.seoul_btn1 -> {
                // Handle the click for "센트럴 시티" button
                // Start the NextActivity
                val intent = Intent(this, Bus4::class.java)
                startActivity(intent)
                // Add more cases for other buttons if needed
            }
        }
    }
}
