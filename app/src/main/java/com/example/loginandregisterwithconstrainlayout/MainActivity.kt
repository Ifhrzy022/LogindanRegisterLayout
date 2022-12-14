package com.example.loginandregisterwithconstrainlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnToLogin()
    }

    private fun btnToLogin() {
        btn_signIn.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}