package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var getFrase = intent.getStringExtra("frase")
        var getEdad = intent.getIntExtra("edad", 0)

        Log.d("DATOS:", "Datos recibidos con exito fueron frase $getFrase y edad $getEdad")

        var btnAbrirPantalla = findViewById<Button>(R.id.btnPantalla)
        btnAbrirPantalla.setOnClickListener{
            var i = Intent(this, MainActivity::class.java)

            startActivity(i)
        }

        var btnCerrarPantalla = findViewById<Button>(R.id.btnClose)
        btnCerrarPantalla.setOnClickListener {
            finish()
        }
    }
}