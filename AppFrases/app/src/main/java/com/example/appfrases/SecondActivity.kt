package com.example.appfrases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    private var btnSend : Button? = null
    private var btnNext : Button? = null
    private var etFrase : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Inicializando Vistas
        inicializarVistas()

        // Asignando Eventos
        asignarEventos()
    }

    private fun inicializarVistas() {
        btnSend = findViewById(R.id.btnSend)
        btnNext = findViewById(R.id.btnNext)
        etFrase = findViewById(R.id.etFrase)
    }

    private fun asignarEventos() {
        btnSend?.setOnClickListener(this)
        btnNext?.setOnClickListener(this)
    }

    private fun getFrase() : String {
        return etFrase?.text.toString()
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0?.id) {
            R.id.btnSend -> {
                val frase = getFrase()

                var i = Intent(this, MainActivity::class.java)
                i.putExtra("frase", frase)
                startActivity(i)
            }
            R.id.btnNext -> {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }
    }
}