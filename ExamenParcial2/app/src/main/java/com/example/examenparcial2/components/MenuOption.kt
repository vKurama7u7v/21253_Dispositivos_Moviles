package com.example.examenparcial2.components

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenparcial2.R

class MenuOption : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_option)

        val recycler = findViewById<RecyclerView>(R.id.RecyclerMenuOptions)

        val CANTIDAD_COLUMNAS = 2
        var administradorDeLayouts = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)

        recycler.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)

    }
}