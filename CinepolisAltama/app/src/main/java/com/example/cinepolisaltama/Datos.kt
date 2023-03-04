package com.example.cinepolisaltama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Datos : AppCompatActivity() {
    private var txtDatos: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        var datos = intent.getStringExtra("valor")
        Log.d("DATOS:", datos.toString())

        inicializarVistas()

        txtDatos?.setText(datos)
    }

    private fun inicializarVistas(){
        txtDatos = findViewById(R.id.txtDatos)
    }
}