package com.mawit.passwordgeneretor.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.mawit.passwordgeneretor.databinding.ActivityMainMenuBinding

class MainMenu : AppCompatActivity() {

    private lateinit var binding : ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#1244F5")

        buttonsToActivities()

        alertMessages()



    }


    private fun buttonsToActivities(){

        binding.btnRandomPassword.setOnClickListener {
            startActivity(Intent(this, RandomPassword::class.java))
        }

        binding.btnNamePassword.setOnClickListener {
            startActivity(Intent(this, NamePassword::class.java))
        }

        binding.btnDatePassword.setOnClickListener {
            startActivity(Intent(this, DatePassword::class.java))
        }

    }

    private fun alertMessages(){

        binding.imgInfoRandomPassword.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Random password")
                .setMessage("With this option, a password with completely random characters will be generated, only needing to define the number of characters you want.")
                .setPositiveButton("OK"){ _, position -> }
                .create()
                .show()
        }

        binding.imgInfoPasswordWords.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Password with word")
                .setMessage("With this option, a password will be generated with characters of some word you want, like your name for example.")
                .setPositiveButton("OK"){ _, position -> }
                .create()
                .show()
        }

        binding.imgInfoPasswordNumbers.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Password with numbers")
                .setMessage("With this option, a password will be generated from numbers provided by you, such as the date of birth for example.")
                .setPositiveButton("OK"){ _, position -> }
                .create()
                .show()
        }

    }
}