package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class cgv1 : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1_cgv)

        // 툴바의 좌우 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.btnLeft).setOnClickListener(this)
        findViewById<View>(R.id.btnRight).setOnClickListener(this)

        // '티켓 구매' 이미지 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.IB_buyTicket_cgv).setOnClickListener(this)
        findViewById<View>(R.id.IB_printTicket_cgv).setOnClickListener(this)
        findViewById<View>(R.id.IB_1_1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.IB_1_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.IB_1_3_cgv).setOnClickListener(this)
    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnLeft -> {
                // '이전 페이지로' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, MainActivity_practicemode::class.java)
                startActivity(intent)
            }
            R.id.btnRight -> {
                // '홈' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_second::class.java)
                startActivity(intent)
            }
            R.id.IB_buyTicket_cgv -> {
                // '티켓 구매' 이미지 버튼 클릭 시 다음 페이지로 이동
                val intent = Intent(this, cgv2 ::class.java)
                startActivity(intent)
            }
            R.id.IB_1_1_cgv -> {
                // '예매 티켓 출력' 이미지 버튼 클릭 시 대화상자로 오류 아림
                var dlg= AlertDialog.Builder(this@cgv1)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("티켓 구매를 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인",null)
                dlg.show()
            }
            R.id.IB_1_2_cgv -> {
                // '티켓 구매' 이미지 버튼 클릭 시 다음 페이지로 이동
                var dlg= AlertDialog.Builder(this@cgv1)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("티켓 구매를 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인",null)
                dlg.show()
            }
            R.id.IB_1_3_cgv -> {
                // '티켓 구매' 이미지 버튼 클릭 시 다음 페이지로 이동
                var dlg= AlertDialog.Builder(this@cgv1)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("티켓 구매를 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인",null)
                dlg.show()
            }
        }
    }
}
