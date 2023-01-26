package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var btnAbrirPantalla = findViewById<Button>(R.id.btnPantalla)
        btnAbrirPantalla.setOnClickListener{
            var i = Intent(this, MainActivity::class.java)

            startActivity(i)
        }
    }
}