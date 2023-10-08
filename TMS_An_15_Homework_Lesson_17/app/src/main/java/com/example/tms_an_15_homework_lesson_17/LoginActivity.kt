package com.example.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStop() {
        super.onStop()
        startActivity(Intent(this, RegistrationActivity::class.java))
    }
}