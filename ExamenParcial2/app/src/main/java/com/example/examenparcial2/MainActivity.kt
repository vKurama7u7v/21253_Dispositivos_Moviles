package com.example.examenparcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnCat: Button? = null
    private var btnProfile: Button? = null
    private var btnSettings: Button? = null
    private var btnClose: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarVistas()
        asignarEventos()
    }

    // Menu Icons
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_icons, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun inicializarVistas(){
        btnCat = findViewById(R.id.optionCat)
        btnProfile = findViewById(R.id.optionProfile)
        btnSettings = findViewById(R.id.optionConfig)
        btnClose = findViewById(R.id.optionClose)
    }

    private fun asignarEventos(){
        btnCat?.setOnClickListener(this)
        btnProfile?.setOnClickListener(this)
        btnSettings?.setOnClickListener(this)
        btnClose?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
    }
}