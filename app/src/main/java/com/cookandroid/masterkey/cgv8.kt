package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cgv8 : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9_cgv)

        // 좌석 선택 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.kioskAgain).setOnClickListener(this)
        findViewById<View>(R.id.goToHome).setOnClickListener(this)

    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.kioskAgain -> {
                // '키오스트 선택 페이지로' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, cgv1::class.java)
                startActivity(intent)
            }
            R.id.goToHome -> {
                // '홈으로 가기' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_sencond::class.java)
                startActivity(intent)
            }
        }
    }
}