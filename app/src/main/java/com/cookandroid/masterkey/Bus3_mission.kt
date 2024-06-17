package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TableLayout
import androidx.appcompat.app.AlertDialog

class Bus3_mission : AppCompatActivity() , View.OnClickListener {

    private lateinit var tableLayout1: TableLayout
    private lateinit var tableLayout2: TableLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus3_mission)

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
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }//Tool

        // Find your TableLayouts
        tableLayout1 = findViewById(R.id.tableLayout1)
        tableLayout2 = findViewById(R.id.tableLayout2)

        // Find your buttons
        val btnAllBus: Button = findViewById(R.id.btnall_bus)
        val btnSeoulBus: Button = findViewById(R.id.btnseoul_bus)
        val btnin_bus: Button = findViewById(R.id.btnin_bus)
        val btn_kangwon_bus: Button = findViewById(R.id.btn_kangwon_bus)
        val btndae_bus1: Button = findViewById(R.id.btndae_bus1)
        val seoulBtn1: Button = findViewById(R.id.seoul_btn1)
        val seoulBtn2: Button = findViewById(R.id.seoul_btn2)
        // Assuming this is the "센트럴 시티" button

        // Set click listeners
        btnAllBus.setOnClickListener(this)
        btnSeoulBus.setOnClickListener(this)
        seoulBtn1.setOnClickListener(this)


        btnAllBus.setOnClickListener {
            var dlg = AlertDialog.Builder(this@Bus3_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("센트럴시티는 서울을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        btnin_bus.setOnClickListener {
            var dlg = AlertDialog.Builder(this@Bus3_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("센트럴시티는 서울을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        btn_kangwon_bus.setOnClickListener {
            var dlg = AlertDialog.Builder(this@Bus3_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("센트럴시티는 서울을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        btndae_bus1.setOnClickListener {
            var dlg = AlertDialog.Builder(this@Bus3_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("센트럴시티는 서울을 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        seoulBtn2.setOnClickListener {
            var dlg = AlertDialog.Builder(this@Bus3_mission)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("센트럴시티를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
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
                val intent = Intent(this, Bus4_mission::class.java)
                startActivity(intent)
                // Add more cases for other buttons if needed
            }
        }
    }
}
