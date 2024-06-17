package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class Bus4_mission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus4_mission)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus3_mission::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }//Tool

        // Find your ImageView
        val arrow1: ImageView = findViewById(R.id.arrow1)
        val arrow2: ImageView = findViewById(R.id.arrow2)
        val arrow3: ImageView = findViewById(R.id.arrow3)
        val arrow4: ImageView = findViewById(R.id.arrow4)
        val arrow5: ImageView = findViewById(R.id.arrow5)

        // Set click listener for arrow
        arrow1.setOnClickListener { var dlg= AlertDialog.Builder(this@Bus4_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("11:10행 버스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        arrow2.setOnClickListener {
            val intent = Intent(this, Bus5_mission::class.java)
            startActivity(intent)
        }

        arrow3.setOnClickListener { var dlg= AlertDialog.Builder(this@Bus4_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("11:10행 버스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        arrow4.setOnClickListener { var dlg= AlertDialog.Builder(this@Bus4_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("11:10행 버스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }

        arrow5.setOnClickListener { var dlg= AlertDialog.Builder(this@Bus4_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("11:10행 버스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인",null)
            dlg.show()
        }
    }

}
