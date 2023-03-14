package com.example.clase6marzo.models

import com.example.clase6marzo.R

class FakerVideogames {
    fun getGames(): ArrayList<Videojuego>{
        var videogames : ArrayList<Videojuego>
        videogames = arrayListOf<Videojuego>()

        var videojuego = Videojuego(1, "Zelda Breath of the Wild", 1600F, "Nintendo", R.drawable.zeldabotw)
        videogames.add(videojuego)

        videogames.add(Videojuego(2, "Gears of War 4", 1700F, "Xbox", R.drawable.gears))
        videogames.add(Videojuego(3, "Zelda Tears of the Kingdom", 1600F, "Nintendo", R.drawable.juego))
        videogames.add(Videojuego(4, "Ori", 500F, "Multiplataforma", R.drawable.ori))
        videogames.add(Videojuego(5, "Inmortals", 1200F, "Multiplataforma", R.drawable.inmortals))
        videogames.add(Videojuego(6, "Overwatch", 999F, "Multiplataforma", R.drawable.overwatch))

        return videogames
    }
}