package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvFrase: TextView
        tvFrase = findViewById(R.id.textViewFrase)
        var etFrase: EditText
        etFrase = findViewById(R.id.editTextFrase)

        var btnMostrar = findViewById<Button>(R.id.buttonMostrar)
        btnMostrar.setOnClickListener{
            val frase = etFrase.text.toString()
            Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }
    }
}