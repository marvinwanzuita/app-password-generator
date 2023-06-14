package com.mawit.passwordgeneretor

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.mawit.passwordgeneretor.view.MainMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = Color.parseColor("#1244F5")

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainMenu::class.java))
            finish()
        }, 2000)
    }
}