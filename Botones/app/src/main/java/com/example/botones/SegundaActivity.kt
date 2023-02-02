package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SegundaActivity : AppCompatActivity() {

    private var cambioIcono: Boolean = false
    private lateinit var  imgLogo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var getFrase = intent.getStringExtra("frase")
        var getEdad = intent.getIntExtra("edad", 0)

        Log.d("DATOS:", "Datos recibidos con exito fueron frase $getFrase y edad $getEdad")

        // GifLoader ==> Libreria para reproducir gifs


        // Cambiar ImageView
        imgLogo = findViewById<ImageView>(R.id.imgVLogo)
        //var lel = false
        imgLogo.setOnClickListener {
            //if (lel){
                //imgLogo.setImageResource(R.drawable.a)
                //lel = true
            //} else {
                //imgLogo.setImageResource(R.drawable.iest)
                //lel = false
            //}

            var arregloImagenes = arrayOf<Int>(R.drawable.a, R.drawable.iest)
            if (cambioIcono) {
                imgLogo.setImageResource(arregloImagenes[0])
            } else {
                imgLogo.setImageResource(arregloImagenes[1])
            }

            cambioIcono = !cambioIcono

        }

        // Cambiar de pantalla
        var btnAbrirPantalla = findViewById<Button>(R.id.btnPantalla)
        btnAbrirPantalla.setOnClickListener{
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        // Cerrar Pantalla
        var btnCerrarPantalla = findViewById<Button>(R.id.btnClose)
        btnCerrarPantalla.setOnClickListener {
            finish()
        }

        /*btnCerrarPantalla.setOnClickListener(this)*/



    }

    /*override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnClose -> finish()
            R.id.btnPantalla -> {
                var i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }
            R.id.imgVLogo -> {
                var arregloImagenes = arrayOf<Int>(R.drawable.a, R.drawable.iest)
                if (cambioIcono) {
                    imgLogo.setImageResource(arregloImagenes[0])
                } else {
                    imgLogo.setImageResource(arregloImagenes[1])
                }

                cambioIcono = !cambioIcono
            }

        }
    }
    */
}