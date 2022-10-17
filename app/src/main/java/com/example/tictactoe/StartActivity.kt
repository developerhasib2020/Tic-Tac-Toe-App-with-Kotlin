package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        startbtn.setOnClickListener{
            startActivity(Intent(this,GameActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}