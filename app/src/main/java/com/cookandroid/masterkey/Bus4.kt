package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Bus4 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus4)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)

        // Set OnClickListener for the left button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, Bus3::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for the right button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }//Tool

        // Find your ImageVie
        val arrow1 = findViewById<ImageView>(R.id.arrow1)
        val arrow2 = findViewById<ImageView>(R.id.arrow2)
        val arrow3 = findViewById<ImageView>(R.id.arrow3)
        val arrow4 = findViewById<ImageView>(R.id.arrow4)
        val arrow5 = findViewById<ImageView>(R.id.arrow5)

        // Set click listener for arrow
        arrow1.setOnClickListener(this)
        arrow2.setOnClickListener(this)
        arrow3.setOnClickListener(this)
        arrow4.setOnClickListener(this)
        arrow5.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val arrow1 = findViewById<ImageView>(R.id.arrow1)
        val arrow2 = findViewById<ImageView>(R.id.arrow2)
        val arrow3 = findViewById<ImageView>(R.id.arrow3)
        val arrow4 = findViewById<ImageView>(R.id.arrow4)
        val arrow5 = findViewById<ImageView>(R.id.arrow5)
        arrow1.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }

        arrow2.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }

        arrow3.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }

        arrow4.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }

        arrow5.setOnClickListener {
            val intent = Intent(this, Bus5::class.java)
            startActivity(intent)
        }
            // Add more cases for other click events if needed
    }
}
