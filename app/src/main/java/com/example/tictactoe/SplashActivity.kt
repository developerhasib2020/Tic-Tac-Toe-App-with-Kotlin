package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        splashicon.translationY = -1000f;
        splashname.translationY = 300f;
        splashdeveloper.translationY = 100f;

        splashicon.animate().translationY(0f).duration = 1000;
        splashname.animate().translationY(0f).duration = 700;
        splashdeveloper.animate().translationY(0f).duration = 500;


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)


    }

}
