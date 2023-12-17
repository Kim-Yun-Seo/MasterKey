package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class cgv8 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8_cgv)

        findViewById<View>(R.id.Button8_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.Button8_3_cgv).setOnClickListener(this)

    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.Button8_2_cgv -> {
                // '키오스크 다시 선택하러 가기' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, MainActivity_practicemode::class.java)
                startActivity(intent)
            }
            R.id.Button8_3_cgv -> {
                // '홈으로 가기' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_second::class.java)
                startActivity(intent)
            }
        }
    }
}