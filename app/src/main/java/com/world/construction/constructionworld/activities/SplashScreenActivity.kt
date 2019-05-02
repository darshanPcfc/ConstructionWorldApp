package com.world.construction.constructionworld.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.world.construction.constructionworld.R


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        delayTimer()
    }

    private fun delayTimer() {
        val handler = Handler()
        handler.postDelayed({
            // Do something after 5s = 5000ms
            startNextActivity()
        }, 5000)
    }

    private fun startNextActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
