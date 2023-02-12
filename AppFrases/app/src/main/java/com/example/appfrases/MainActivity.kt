package com.example.appfrases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnRegresar : Button? = null
    private var btnMoreInfo : Button? = null
    private var txtFrase : TextView? = null
    private var getFrase : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando Vistas
        inicializarVistas()

        // Asignando Eventos
        asignarEventos()

        getFrase = intent.getStringExtra("frase")
        Log.d("DATOS:", "Datos recibidos con exito fueron frase $getFrase")

        txtFrase?.text = getFrase
    }

    private fun inicializarVistas() {
        btnRegresar = findViewById(R.id.btnRegresar)
        btnMoreInfo = findViewById(R.id.btnMoreInfo)
        txtFrase = findViewById(R.id.txtFrase)
    }

    private fun asignarEventos() {
        btnRegresar?.setOnClickListener(this)
        btnMoreInfo?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0?.id) {
            R.id.btnRegresar -> {
                val i = Intent(this, SecondActivity::class.java)
                startActivity(i)
                finish()
            }
            R.id.btnMoreInfo -> {
                var msg = Mensajes("Frase: $getFrase", this)
                msg.mostrarSnackbar(p0)
            }
        }
    }
}