package com.example.examenparcial2.models

import com.example.examenparcial2.R

class Navigation {
    fun getMenuOptions(): ArrayList<MenuOptions>{
        var options: ArrayList<MenuOptions>
        options = arrayListOf<MenuOptions>()

        // Agregando opciones al menu
        options.add(MenuOptions(1,"Item 1", R.drawable.cat))

        return options
    }
}