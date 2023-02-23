package com.example.tareabotonesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    private var btnClose : Button? = null
    private var txtResult : TextView? = null
    private var result : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        inicializarVariables()
        asignarEventos()

        result = intent.getStringExtra("calif")
        Log.d("DATOS:", "Datos recibidos con exito: $result")
        txtResult?.text = "Obtuviste un " + result.toString() + " \uD83D\uDE25"
    }

    private fun inicializarVariables() {
        btnClose = findViewById(R.id.btnClose)
        txtResult = findViewById(R.id.txtResult)
    }

    private fun asignarEventos() {
        btnClose?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0?.id){
            R.id.btnClose -> {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }
    }
}