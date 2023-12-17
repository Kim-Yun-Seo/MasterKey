package com.cookandroid.masterkey

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class cgv3 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_cgv)

        // 툴바의 좌우 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.btnLeft).setOnClickListener(this)
        findViewById<View>(R.id.btnRight).setOnClickListener(this)

        // 광고 이미지 버튼에 클릭 리스너 등록
        findViewById<View>(R.id.adultIB_3_1_cgv).setOnClickListener(this) //이 것만 다음 페이지로 넘어감
        findViewById<View>(R.id.adultIB_3_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.adultIB_3_3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.adultIB_3_4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.adultIB_3_5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.adultIB_3_6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.adultIB_3_7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.teenagerIB_3_7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_4_7_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_1_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_2_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_3_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_4_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_5_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_6_cgv).setOnClickListener(this)
        findViewById<View>(R.id.seniorIB_5_2_7_cgv).setOnClickListener(this)



    }

    // 버튼 클릭 시 호출되는 함수
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnLeft -> {
                // '이전 페이지로' 버튼 클릭 시 이전 페이지로 이동
                val intent = Intent(this, cgv2::class.java)
                startActivity(intent)
            }

            R.id.btnRight -> {
                // '홈' 버튼 클릭 시 2번째 페이지로 이동
                val intent = Intent(this, MainActivity_second::class.java)
                startActivity(intent)
            }

            R.id.adultIB_3_1_cgv -> {
                // '일반 1인' 이미지 버튼 클릭 시 다음 페이지로 이동
                val intent = Intent(this, cgv4::class.java)
                startActivity(intent)
            }

            R.id.adultIB_3_2_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.adultIB_3_3_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.adultIB_3_4_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.adultIB_3_5_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.adultIB_3_6_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.adultIB_3_7_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_1_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_2_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_3_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_4_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_5_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_6_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }

            R.id.teenagerIB_3_7_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_1_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_2_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_3_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_4_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_5_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_6_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_4_7_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_1_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_2_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_3_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_4_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_5_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_6_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
            R.id.seniorIB_5_2_7_cgv -> {
                // 오류박스
                var dlg = AlertDialog.Builder(this@cgv3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("일반 1인을 클릭해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            }
        }
    }
}
