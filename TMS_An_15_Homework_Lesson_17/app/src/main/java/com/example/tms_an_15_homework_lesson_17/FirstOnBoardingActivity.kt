package com.example.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FirstOnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
        startActivity(Intent(this, SecondOnBoardingActivity::class.java))
    }
}