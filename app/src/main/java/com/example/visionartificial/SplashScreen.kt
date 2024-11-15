package com.example.visionartificial

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        MostrarBienvenida()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun MostrarBienvenida() {
        object : CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {
                //
            }

            override fun onFinish() {
                val intent = Intent(applicationContext, Inicio::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}