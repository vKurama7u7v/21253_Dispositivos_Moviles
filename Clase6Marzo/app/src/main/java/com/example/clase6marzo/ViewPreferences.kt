package com.example.clase6marzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ViewPreferences : AppCompatActivity(), View.OnClickListener {

    private lateinit var txtNombre: TextView
    private lateinit var txtEdad: TextView
    private lateinit var txtAltura: TextView
    private lateinit var txtMonedero: TextView
    private lateinit var btnClose: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_preferences)

        // Funciones para inicializar vistas
        initViews()
        asignarEventos()

        // Obteniendo datos de SharedPreferences
        val sharedPreference = getSharedPreferences("PERSISTENCIA", MODE_PRIVATE) ?: return
        val nombre = sharedPreference.getString("nombre", "")
        val edad = sharedPreference.getInt("edad", 0).toString()
        val altura = sharedPreference.getFloat("altura", 0.0f).toString()
        val monedero = sharedPreference.getFloat("monedero", 0.0f).toString()

        // Seteando Vistas
        txtNombre.text = nombre
        txtEdad.text = edad
        txtAltura.text = altura
        txtMonedero.text = monedero
    }

    private fun initViews(){
        txtNombre = findViewById(R.id.txtNombre)
        txtEdad = findViewById(R.id.txtEdad)
        txtAltura = findViewById(R.id.txtAltura)
        txtMonedero = findViewById(R.id.txtMonedero)
        btnClose = findViewById(R.id.btnClose)
    }

    private fun asignarEventos(){
        btnClose.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0?.id){
            R.id.btnClose -> {
                val s = Intent(this, ListaDeJuegos::class.java)
                startActivity(s)
                finish()
            }
        }
    }
}