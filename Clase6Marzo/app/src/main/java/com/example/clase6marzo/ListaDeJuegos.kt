package com.example.clase6marzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clase6marzo.adapters.VideojuegoAdapter
import com.example.clase6marzo.models.FakerVideogames
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaDeJuegos : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_juegos)

        val juegos = FakerVideogames().getGames()
        recyclerView = findViewById<RecyclerView>(R.id.recyclerVideojuegos)

        val CANTINDAD_COLUMNAS = 2
        var administradorDeLayouts = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //GridLayoutManager(this, CANTIDAD_COLUMNAS)

        recyclerView.layoutManager = administradorDeLayouts
        recyclerView.adapter = VideojuegoAdapter(juegos, this)

        val fabPreferencias = findViewById<FloatingActionButton>(R.id.fabPreferencias)

        fabPreferencias.setOnClickListener {
            val s = Intent(this, ViewPreferences::class.java)
            startActivity(s)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_vertical -> {
                layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_horizontal -> {
                layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_grid_2 -> {
                // GridLayoutManager de 2 Columnas
                layoutManager = GridLayoutManager(this, 2)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_grid_3 -> {
                // GridLayoutManager de 3 Columnas
                layoutManager = GridLayoutManager(this, 3)
                recyclerView.layoutManager = layoutManager
            }
        }

        return super.onOptionsItemSelected(item)
    }
}