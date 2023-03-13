package com.example.clase6marzo.adapters

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clase6marzo.R
import com.example.clase6marzo.models.Videojuego

class VideojuegoAdapter(videojuegos: ArrayList<Videojuego>, context: Context) {
    var innerVideojuegos: ArrayList<Videojuego> = videojuegos
    var innerContext: Context = context

    inner class ContenedorDeVista(view: View): RecyclerView.ViewHolder(view) {
        // Aquí haremos el inflate del layout
        // Aqui haremos la asignación de Objetos
        // (TextView, ImageView, etc)
        val imageView: ImageView
        val txtTitle: TextView
        val txtConsole: TextView
        val txtPrice: TextView
        val btnBuy: Button

        init {
            // Define click listener for the ViewHolder´s View
            imageView = view.findViewById(R.id.imageView)
            txtTitle = view.findViewById(R.id.txtTitle)
            txtConsole = view.findViewById(R.id.txtConsole)
            txtPrice = view.findViewById(R.id.txtPrice)
            btnBuy = view.findViewById(R.id.btnBuy)
        }
    }
}