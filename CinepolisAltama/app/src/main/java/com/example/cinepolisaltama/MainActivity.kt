package com.example.cinepolisaltama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnComprar: Button? = null
    private var mySpinner: Spinner? = null
    private var txtBottom: TextView? = null
    private var imageView: ImageView? = null
    private var changeIMG: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarVistas()
        asignarEventos()
    }

    private fun inicializarVistas(){
        btnComprar = findViewById(R.id.btnComprar)
        mySpinner = findViewById(R.id.spHorarios)
        txtBottom = findViewById(R.id.txtBottom)
        imageView = findViewById(R.id.imageView)
    }

    private fun asignarEventos(){
        btnComprar?.setOnClickListener(this)
        txtBottom?.setOnClickListener(this)
        imageView?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        // Obtener horario del Spinner
        val value = mySpinner?.selectedItem.toString()

        when(p0?.id){
            R.id.btnComprar -> {
                if(value == "15:00 SUB" || value == "17:00 3D ESP" || value == "19:00 ESP"){
                    Toast.makeText(this, "Lo sentimos se han agotado las entradas", Toast.LENGTH_LONG).show()
                } else {
                    var i = Intent(this, Datos::class.java)
                    i.putExtra("valor", value)
                    startActivity(i)
                }
            }
            R.id.txtBottom -> {
                finish()
            }
            R.id.imageView -> {
                var arregloImagenes = arrayOf<Int>(R.drawable.bg, R.drawable.second)
                if (changeIMG) {
                    imageView?.setImageResource(arregloImagenes[0])
                } else {
                    imageView?.setImageResource(arregloImagenes[1])
                }
                changeIMG = !changeIMG
            }
        }
    }
}