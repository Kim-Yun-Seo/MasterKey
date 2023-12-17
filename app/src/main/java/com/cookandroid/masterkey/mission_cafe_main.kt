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
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class mission_cafe_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_cafe_main)

        val americanoButton: ImageView = findViewById(R.id.imageButton1_cafe)
        val hotameButton: ImageView = findViewById(R.id.imageButton2_cafe)
        val peanutButton: ImageView = findViewById(R.id.imageButton3_cafe)
        val aspresoButton: ImageView = findViewById(R.id.imageButton4_cafe)
        val caramelButton: ImageView = findViewById(R.id.imageButton5_cafe)
        val latteeButton: ImageView = findViewById(R.id.imageButton6_cafe)
        val moccaButton: ImageView = findViewById(R.id.imageButton7_cafe)
        val vanilaButton: ImageView = findViewById(R.id.imageButton8_cafe)
        val coldbrewButton: ImageView = findViewById(R.id.imageButton9_cafe)

        val blueButton: ImageView = findViewById(R.id.imageButton1_cafe2)
        val ssangButton: ImageView = findViewById(R.id.imageButton2_cafe2)
        val saengButton: ImageView = findViewById(R.id.imageButton3_cafe2)
        val dalgonaButton: ImageView = findViewById(R.id.imageButton4_cafe2)
        val chocoButton: ImageView = findViewById(R.id.imageButton5_cafe2)
        val malchaButton: ImageView = findViewById(R.id.imageButton6_cafe2)
        val gokButton: ImageView = findViewById(R.id.imageButton7_cafe2)
        val hongButton: ImageView = findViewById(R.id.imageButton8_cafe2)
        val kiwiButton: ImageView = findViewById(R.id.imageButton9_cafe2)


        val cancelButton: TextView = findViewById(R.id.cancel_button_cafe)
        val totalPrice: TextView = findViewById(R.id.payAmount_cafe)
        val firstBox: ImageView = findViewById(R.id.cafe_box1)
        val secondBox: ImageView = findViewById(R.id.cafe_box2)
        val thirdBox: ImageView = findViewById(R.id.cafe_box3)
        val toPayButton: ImageView = findViewById(R.id.payBtn)
        val btn1Cafe: AppCompatButton = findViewById(R.id.btn1_cafe)
        val btn2Cafe: AppCompatButton = findViewById(R.id.btn2_cafe)
        val btn3Cafe: AppCompatButton = findViewById(R.id.btn3_cafe)
        val btn4Cafe: AppCompatButton = findViewById(R.id.btn4_cafe)
        val btn5Cafe: AppCompatButton = findViewById(R.id.btn5_cafe)
        val btn6Cafe: AppCompatButton = findViewById(R.id.btn6_cafe)
        val btn7Cafe: AppCompatButton = findViewById(R.id.btn7_cafe)
        val btn8Cafe: AppCompatButton = findViewById(R.id.btn8_cafe)


        val gridLayout: GridLayout = findViewById(R.id.bigGridLayout_cafe)
        val gridLayout2: GridLayout = findViewById(R.id.bigGridLayout_cafe2)
        val backButton: ImageView = findViewById(R.id.btnLeft)
        val homeButton: ImageView = findViewById(R.id.btnRight)

        homeButton.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_first::class.java)
            startActivity(intent)
        }


        americanoButton.setOnClickListener {
            // 클릭 시 수행할 동작
            changeText(totalPrice)
            changeFirstMenu(firstBox)
        }

        cancelButton.setOnClickListener {
            cancelMenu(firstBox)
            cancelMenu(secondBox)
            cancelMenu(thirdBox)
            cancelPrice(totalPrice)
        }

        toPayButton.setOnClickListener {
            var intent = Intent(this, mission_cafe_cart::class.java)
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

        btn3Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        btn4Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        btn5Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        btn6Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        btn7Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
        btn8Cafe.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("COFFEE 혹은 베버리지를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }


        hotameButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        peanutButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        aspresoButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        caramelButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        latteeButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        moccaButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        vanilaButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        coldbrewButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("아메리카노를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        blueButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }


        dalgonaButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        chocoButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        malchaButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        gokButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        ssangButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        ssangButton.setOnClickListener {
            changeSecondMenu(secondBox)
            changeText2(totalPrice)

        }

        hongButton.setOnClickListener {
            changeThirdMenu(thirdBox)
            changeText3(totalPrice)
        }

        kiwiButton.setOnClickListener {
            var dlg = AlertDialog.Builder(this@mission_cafe_main)
            dlg.setTitle("다시 선택해주세요!")
            dlg.setMessage("쌍화차 혹은 홍시주스를 눌러주세요.")
            dlg.setIcon(R.drawable.error_icon)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }

        homeButton.setOnClickListener {
            var intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }

    }
    private fun changeText(textView: TextView) {
        textView.text = "₩3200"
    }
    private fun changeText2(textView: TextView) {
        textView.text = "₩7400"
    }

    private fun changeText3(textView: TextView) {
        textView.text = "₩11900"
    }

    private fun changeFirstMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.ame_change_cafe)
    }

    private fun changeSecondMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.ssang_mission)
    }

    private fun changeThirdMenu(imageView: ImageView) {
        imageView.setImageResource(R.drawable.hong_mission)
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