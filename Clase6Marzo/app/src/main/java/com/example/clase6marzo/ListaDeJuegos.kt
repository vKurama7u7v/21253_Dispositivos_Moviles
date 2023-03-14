package com.example.clase6marzo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clase6marzo.adapters.VideojuegoAdapter
import com.example.clase6marzo.models.FakerVideogames

class ListaDeJuegos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_juegos)

        val juegos = FakerVideogames().getGames()
        val recycler = findViewById<RecyclerView>(R.id.recyclerVideojuegos)

        val CANTINDAD_COLUMNAS = 2
        var administradorDeLayouts = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //GridLayoutManager(this, CANTIDAD_COLUMNAS)

        recycler.layoutManager = administradorDeLayouts
        recycler.adapter = VideojuegoAdapter(juegos, this)
    }
}