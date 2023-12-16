package com.cookandroid.masterkey

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class mission_hospital_3 : AppCompatActivity() {
    lateinit var btn_back : Button; lateinit var btn_next : Button
    lateinit var chkTv1 : CheckedTextView; lateinit var chkTv2 : CheckedTextView
    lateinit var chkTv3 : CheckedTextView; lateinit var btnNew : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_hospital3)

        // SpannableString 생성 및 설정
        val spannableString1 = SpannableString("김성신   2002010101\n김똑딱 원장님 | 접수상황")
        spannableString1.setSpan(StyleSpan(Typeface.BOLD), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString1.setSpan(AbsoluteSizeSpan(15, true), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString1.setSpan(AbsoluteSizeSpan(13, true), 4, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString1.setSpan(AbsoluteSizeSpan(12, true), 15, spannableString1.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val spannableString2 = SpannableString("김난향   2004010130\n일반접수")
        spannableString2.setSpan(StyleSpan(Typeface.BOLD), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString2.setSpan(AbsoluteSizeSpan(15, true), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString2.setSpan(AbsoluteSizeSpan(13, true), 4, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString2.setSpan(AbsoluteSizeSpan(12, true), 15, spannableString2.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val spannableString3 = SpannableString("김수정   2001010101\n성신 원장님")
        spannableString3.setSpan(StyleSpan(Typeface.BOLD), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString3.setSpan(AbsoluteSizeSpan(15, true), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString3.setSpan(AbsoluteSizeSpan(13, true), 4, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString3.setSpan(AbsoluteSizeSpan(12, true), 15, spannableString3.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // CheckedTextView 초기화 및 SpannableString 설정
        chkTv1 = findViewById(R.id.chkTv1)
        chkTv1.text = spannableString1
        chkTv1.setOnClickListener {
            // 클릭 이벤트 처리
            onCheckedTextViewClick(chkTv1)
        }

        chkTv2 = findViewById(R.id.chkTv2)
        chkTv2.text = spannableString2
        chkTv2.setOnClickListener {
            // 클릭 이벤트 처리
            onCheckedTextViewClick(chkTv2)
        }

        chkTv3 = findViewById(R.id.chkTv3)
        chkTv3.text = spannableString3
        chkTv3.setOnClickListener {
            // 클릭 이벤트 처리
            onCheckedTextViewClick(chkTv3)
        }
        // SpannableString 생성
        val spannableString4 = SpannableString("신규접수\n처음 방문한 분은 데스크에서 신규 접수해주세요.")

        // "신규접수" 텍스트 스타일과 크기 설정
        spannableString4.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString4.setSpan(AbsoluteSizeSpan(15, true), 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        // "처음 방문한 분은 신규로 접수해주세요" 텍스트 크기 설정
        spannableString4.setSpan(AbsoluteSizeSpan(12, true), 5, spannableString4.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        // Button 초기화 및 SpannableString 설정
        btnNew = findViewById(R.id.btnNew)
        btnNew.text = spannableString4

        //이전, 다음 버튼 클릭 이벤트 설정
        btn_back = findViewById<Button>(R.id.btn_back)
        btn_next = findViewById<Button>(R.id.btn_next)

        btn_back.setOnClickListener {
            // 두 번째 화면으로 이동
            val intent = Intent(this, mission_hospital_2::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }

        btn_next.setOnClickListener {
            if (chkTv1.isChecked && chkTv3.isChecked && chkTv2.isChecked) {
                val dlg = AlertDialog.Builder(this@mission_hospital_3)
                dlg.setTitle("다시 선택해주세요!")
                dlg.setMessage("김성신,김수정으로 접수해주세요.")
                dlg.setIcon(R.drawable.error_icon)
                dlg.setPositiveButton("확인", null)
                dlg.show()
            } else if (chkTv1.isChecked && chkTv3.isChecked) {
                val intent = Intent(this, mission_hospital_4::class.java)
                startActivity(intent)
            } else {
                if (!chkTv1.isChecked && !chkTv3.isChecked) {
                    val dlg = AlertDialog.Builder(this@mission_hospital_3)
                    dlg.setTitle("다시 선택해주세요!")
                    dlg.setMessage("김성신,김수정으로 접수해주세요.")
                    dlg.setIcon(R.drawable.error_icon)
                    dlg.setPositiveButton("확인", null)
                    dlg.show()
                } else {
                    // chkTv1과 chkTv3 중 하나만 체크한 경우 처리
                    val dlg = AlertDialog.Builder(this@mission_hospital_3)
                    dlg.setTitle("다시 선택해주세요!")
                    dlg.setMessage("김성신,김수정으로 접수해주세요.")
                    dlg.setIcon(R.drawable.error_icon)
                    dlg.setPositiveButton("확인", null)
                    dlg.show()
                }
            }
        }
        val btnLeftImageView = findViewById<ImageView>(R.id.btnLeft)
        val btnRightImageView = findViewById<ImageView>(R.id.btnRight)
        // Tool bar back button
        btnLeftImageView.setOnClickListener {
            val intent = Intent(this, mission_hospital_2::class.java)
            startActivity(intent)
        }
        // Tool bar Home Button
        btnRightImageView.setOnClickListener {
            // Handle the right button click
            val intent = Intent(this, MainActivity_sencond::class.java)
            startActivity(intent)
        }
    }
    private fun onCheckedTextViewClick(checkedTextView: CheckedTextView) {
        // CheckedTextView 클릭 이벤트 처리
        checkedTextView.isChecked = !checkedTextView.isChecked
    }
}