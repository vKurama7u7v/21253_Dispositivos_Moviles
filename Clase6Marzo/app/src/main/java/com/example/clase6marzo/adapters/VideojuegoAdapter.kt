package com.example.clase6marzo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clase6marzo.R
import com.example.clase6marzo.models.Videojuego

class VideojuegoAdapter(videojuegos: ArrayList<Videojuego>, context: Context): RecyclerView.Adapter<VideojuegoAdapter.ContenedorDeVista>() {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContenedorDeVista {
        //TODO("Not yet implemented")
        // => Retorna la vista de el componente de los videojuegos
        // viewType = Se usa cuando se tienen adaptadores diferentes (ejemplo ads)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_second, parent, false)
        return ContenedorDeVista(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        // => Retorna el número de items
        return innerVideojuegos.size
    }

    override fun onBindViewHolder(holder: ContenedorDeVista, position: Int) {
        //TODO("Not yet implemented")
        // => Se ejecuta cada vez que entra un nuevo item
        // => Edita las vistas/labels de el layout (nombre, precio, imagen, etc)

        val videojuego: Videojuego = innerVideojuegos.get(position)
        holder.txtTitle.text = videojuego.nombre
        holder.txtConsole.text = videojuego.consola
        holder.txtPrice.text = videojuego.precio.toString()
        holder.imageView.setImageResource(videojuego.imagen)
    }
}