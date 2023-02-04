package com.example.linearlayoutactivity

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnSuma : Button? = null
    private var btnResta : Button? = null
    private var btnMulti : Button? = null
    private var btnDividir : Button? = null
    private var etNumeroPrimero : EditText? = null
    private var etNumeroSegundo : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarVistas()
        asignarEventos()
    }

    override fun onClick(p0: View?) {
        // aqui entrara los click de las vistas
        val numeroUno = etNumeroPrimero?.text.toString().toFloatOrNull()
        val numeroDos = etNumeroSegundo?.text.toString().toFloatOrNull()

        // Si los valores son null (Si los campos estan vacios)
        if (numeroUno == null || numeroDos == null)
            return

        // De lo contrario...
        val aritmetica = Aritmetica()

        when(p0?.id){
            R.id.btnSuma -> {
                val suma = aritmetica.suma(numeroUno, numeroDos)
                val msg = Mensajes("La sumatoria fue $suma", this)
                msg.mostrarToast()
            }
            R.id.btnResta -> {
                val resta = aritmetica.resta(numeroUno, numeroDos)
                val msg = Mensajes("La resta fue $resta", this)
                msg.mostrarSnackbar(p0)
            }
            R.id.btnMulti -> {
                val multi = aritmetica.multiplicacion(numeroUno, numeroDos)
                val msg = Mensajes("La multiplicación fue $multi", this)
                msg.mostrarToast()
            }
            R.id.btnDivision -> {
                val division = aritmetica.division(numeroUno, numeroDos)
                val msg = Mensajes("La division fue $division", this)
                msg.mostrarSnackbar(p0)
            }
        }
    }

    private fun inicializarVistas(){
        btnSuma = findViewById(R.id.btnSuma)
        btnResta = findViewById(R.id.btnResta)
        btnMulti = findViewById(R.id.btnMulti)
        btnDividir = findViewById(R.id.btnDivision)
        etNumeroPrimero = findViewById(R.id.etNumeroPrimero)
        etNumeroSegundo = findViewById(R.id.etNumeroSegundo)
    }

    private fun asignarEventos(){
        btnSuma?.setOnClickListener(this)
        btnResta?.setOnClickListener(this)
        btnMulti?.setOnClickListener(this)
        btnDividir?.setOnClickListener(this)
    }
}