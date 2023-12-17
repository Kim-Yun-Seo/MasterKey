package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class hospital_2 : AppCompatActivity() {
    lateinit var btn_phone : Button
    lateinit var btn_number : Button; lateinit var btn_qrcode : Button
    lateinit var editTextPhone2 : EditText; lateinit var chkBx1 : CheckBox
    lateinit var btn_back : Button; lateinit var btn_next : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_2)

        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        btn_phone = findViewById<Button>(R.id.btn_phone)
        btn_number = findViewById<Button>(R.id.btn_number)
        btn_qrcode = findViewById<Button>(R.id.btn_qrcode)
        editTextPhone2 = findViewById<EditText>(R.id.editTextPhone2)
        chkBx1 = findViewById<CheckBox>(R.id.chkBx1)
        btn_back = findViewById<Button>(R.id.btn_back)
        btn_next = findViewById<Button>(R.id.btn_next)

        val btnIds = arrayOf(
            R.id.btn_1, R.id.btn_2, R.id.btn_3,
            R.id.btn_4, R.id.btn_5, R.id.btn_6,
            R.id.btn_7, R.id.btn_8, R.id.btn_9,
            R.id.btn_10, R.id.btn_11, R.id.btn_12
        )
        for (btnID in btnIds){
            findViewById<ImageButton>(btnID).setOnClickListener{onButtonClick(it)}
        }

        chkBx1.setOnClickListener{
            chkBx1.isChecked = true
        }

        btn_back.setOnClickListener {
            // 첫 번째 화면으로 이동
            val intent = Intent(this, hospital_1::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }

        btn_next.setOnClickListener {
            if (!chkBx1.isChecked) {
                val toast = Toast.makeText(applicationContext, "개인정보수집 동의해주세요.", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val intent = Intent(this, hospital_3::class.java)
                startActivity(intent)
                finish() // 현재 액티비티 종료
            }
        }
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, hospital_1::class.java)
            startActivity(intent)
            finish()
        }

        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun onButtonClick(view: View){
        val resourceId = view.id
        when (resourceId) {
            R.id.btn_1 -> appendNumber("1")
            R.id.btn_2 -> appendNumber("2")
            R.id.btn_3 -> appendNumber("3")
            R.id.btn_4 -> appendNumber("4")
            R.id.btn_5 -> appendNumber("5")
            R.id.btn_6 -> appendNumber("6")
            R.id.btn_7 -> appendNumber("7")
            R.id.btn_8 -> appendNumber("8")
            R.id.btn_9 -> appendNumber("9")
            R.id.btn_10 -> deleteLastDigit()
            R.id.btn_11 -> appendNumber("0")
            R.id.btn_12 -> deleteAllDigits()
        }
    }
    private fun appendNumber(number: String){
        val currentText=editTextPhone2.text.toString()
        editTextPhone2.setText(currentText+number)
    }
    private fun deleteLastDigit(){
        val currentText = editTextPhone2.text.toString()
        if(currentText.isNotEmpty()){
            editTextPhone2.setText(currentText.substring(0, currentText.length -1))
        }
    }
    private fun deleteAllDigits(){
        editTextPhone2.setText("")
    }
}