package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class cgv2 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_cgv)

        // 툴바의 좌우 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.btnLeft).setOnClickListener(this)
        findViewById<View>(R.id.btnRight).setOnClickListener(this)

        // 포스터 이미지 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.Poster2_1_cgv).setOnClickListener(this)
    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnLeft -> {
                // '이전 페이지로' 버튼 클릭 시 4번째 페이지로 이동
                val intent = Intent(this, cgv1::class.java)
                startActivity(intent)
            }
            R.id.btnRight -> {
                // '홈' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_sencond::class.java)
                startActivity(intent)
            }
            R.id.Poster2_1_cgv -> {
                // '포스터1' 이미지 버튼 클릭 시 다음 페이지로 이동
                val intent = Intent(this, cgv3::class.java)
                startActivity(intent)
            }
        }
    }
}
