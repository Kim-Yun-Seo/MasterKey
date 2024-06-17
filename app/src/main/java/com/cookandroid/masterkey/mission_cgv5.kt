package com.cookandroid.masterkey

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class mission_cgv5 : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5_cgv)

        // 툴바의 좌우 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.btnLeft).setOnClickListener(this)
        findViewById<View>(R.id.btnRight).setOnClickListener(this)

        // 좌석 선택 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.seat_5_A0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_A8_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_B8_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_C8_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_D8_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_E6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_F6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_G6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H0_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seat_5_H8_cgv).setOnClickListener(this)

    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnLeft -> {
                // '이전 페이지로' 버튼 클릭 시 3번째 페이지로 이동
                val intent = Intent(this, mission_cgv4::class.java)
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
                val intent = Intent(this, mission_cgv6::class.java)
                startActivity(intent)
            }


            R.id.seat_5_A0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A7_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_A8_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_B0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B7_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_B8_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_C0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C7_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_C8_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_D0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D7_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_D8_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_E0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_E1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_E2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_E4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_E5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_E6_cgv-> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_F0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_F6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_G0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_G6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.seat_5_H0_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H1_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H2_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H3_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H4_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H5_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H6_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H7_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seat_5_H8_cgv-> {
                // 오류박스
                val dlg = AlertDialog.Builder(this@mission_cgv5)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("E4 좌석을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

        }
    }
}