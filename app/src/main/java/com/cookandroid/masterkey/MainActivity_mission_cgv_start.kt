package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity_mission_cgv_start : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mission_cgv_start)

        findViewById<View>(R.id.Button_q_1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.Button_q_2_cgv).setOnClickListener(this)
    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.Button_q_1_cgv -> {
                // '미션 시작' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, MainActivity1::class.java)
                startActivity(intent)
            }
            R.id.Button_q_2_cgv -> {
                // '홈으로 돌아가기' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_second::class.java)
                startActivity(intent)
            }
        }
    }
}