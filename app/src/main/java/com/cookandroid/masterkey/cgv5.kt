package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class cgv5 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5_cgv)

        // 툴바의 좌우 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.btnLeft).setOnClickListener(this)
        findViewById<View>(R.id.btnRight).setOnClickListener(this)

        // 좌석 선택 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.seat_5_E3_cgv).setOnClickListener(this)
    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnLeft -> {
                // '이전 페이지로' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, cgv4::class.java)
                startActivity(intent)
            }
            R.id.btnRight -> {
                // '홈' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_sencond::class.java)
                startActivity(intent)
            }

            //E4 좌석 클릭
            R.id.seat_5_E3_cgv -> {
                // 'E4'좌석 버튼 클릭 시 다음 페이지로 이동
                val intent = Intent(this, cgv6::class.java)
                startActivity(intent)
            }
        }
    }
}