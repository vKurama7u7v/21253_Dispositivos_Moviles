package com.example.tareabotonesintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private var txtResult : TextView? = null
    private var result : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        inicializarVariables()

        result = intent.getStringExtra("calif")
        Log.d("DATOS:", "Datos recibidos con exito: $result")
        txtResult?.text = "Obtuviste un " + result.toString() + " \uD83D\uDE25"

    }

    private fun inicializarVariables() {
        txtResult = findViewById(R.id.txtResult)
    }
}