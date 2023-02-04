package com.example.tareabotonesintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnSend: Button? = null
    private var etCalif: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarVistas()
        asignarEventos()
    }

    override fun onClick(p0: View?) {
        // TODO("Not yet implemented")
        // Casteando valor a tipo INT
        val number = etCalif?.text.toString().toIntOrNull()

        // Si campo Calificación esta vacio?
        if (number == null) {
            Toast.makeText(this, "Los campos estan vacios", Toast.LENGTH_LONG).show()
            return
        }

        when(p0?.id){
            R.id.btnSend -> {
                Toast.makeText(this, "Calificacion $number", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun inicializarVistas(){
        btnSend = findViewById(R.id.btnSend)
        etCalif = findViewById(R.id.inputCalif)
    }

    private fun asignarEventos(){
        btnSend?.setOnClickListener(this)
    }
}