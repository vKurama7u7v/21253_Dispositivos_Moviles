package com.example.linearlayoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnSuma : Button? = null
    private var btnResta : Button? = null
    private var etNumeroPrimero : EditText? = null
    private var etNumeroSegundo : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSuma = findViewById(R.id.btnSuma)
        btnResta = findViewById(R.id.btnResta)

        btnSuma?.setOnClickListener(this)
        btnResta?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
        when(p0?.id){
            R.id.btnSuma -> Toast.makeText(this, "Hice click en suma", Toast.LENGTH_LONG).show()
            R.id.btnResta -> {
                Snackbar.make(p0, "Hice click en Resta", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}