package com.example.clase6marzo.models

import com.example.clase6marzo.R

class FakerVideogames {
    fun getGames(): ArrayList<Videojuego>{
        var videogames : ArrayList<Videojuego>
        videogames = arrayListOf<Videojuego>()

        videogames.add(Videojuego(1, "Zelda Breath of the Wild", 1600F, "Nintendo", R.drawable.zeldabotw, "Everyone"))
        videogames.add(Videojuego(2, "Gears of War 4", 1700F, "Xbox", R.drawable.gears, "Mature"))
        videogames.add(Videojuego(3, "Zelda Tears of the Kingdom", 1600F, "Nintendo", R.drawable.juego, "Everyone"))
        videogames.add(Videojuego(4, "Ori", 500F, "Multiplataforma", R.drawable.ori, "Everyone"))
        videogames.add(Videojuego(5, "Inmortals", 1200F, "Multiplataforma", R.drawable.inmortals, "Everyone"))
        videogames.add(Videojuego(6, "Overwatch", 999F, "Multiplataforma", R.drawable.overwatch, "Everyone"))

        return videogames
    }
}