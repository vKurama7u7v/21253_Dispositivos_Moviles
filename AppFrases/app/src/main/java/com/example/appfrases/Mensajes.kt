package com.example.appfrases

import android.content.Context
import android.view.View
import com.google.android.material.snackbar.Snackbar

class Mensajes(var msg: String, var ctx : Context) {
    fun mostrarSnackbar(vista: View){
        Snackbar.make(vista, msg, Snackbar.LENGTH_LONG).show()
    }
}