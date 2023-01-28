package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var tvFrase: TextView
    private lateinit var etFrase: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvFrase = findViewById(R.id.textViewFrase)
        etFrase = findViewById(R.id.editTextFrase)

        var btnMostrar = findViewById<Button>(R.id.buttonMostrar)
        btnMostrar.setOnClickListener{
            val frase = getFrase()
            Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }

        var btnSiguiente = findViewById<Button>(R.id.btnNext)
        btnSiguiente.setOnClickListener {
            var i = Intent(this, SegundaActivity::class.java)
            i.putExtra("frase", getFrase()) // Mandamos dato frase con valor que tenga la vista
            i.putExtra("edad", 21) // Enviamos dato "edad" con valor 21
            startActivity(i)
        }


    }

    private fun getFrase() : String{
        return etFrase.text.toString()
    }
}