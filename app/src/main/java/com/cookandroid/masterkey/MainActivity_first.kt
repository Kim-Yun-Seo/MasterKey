package com.cookandroid.masterkey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity_first : AppCompatActivity() {
    private val DELAY_TIME: Long = 3000 // 3초 대기 시간
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_first)

        // 5초 후 MainActivitySecond로 전환
        Handler().postDelayed({
            val intent = Intent(this@MainActivity_first, MainActivity_sencond::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }, DELAY_TIME)
    }
}