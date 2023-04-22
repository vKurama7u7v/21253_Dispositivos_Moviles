package edu.iest.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnClose: ImageView
    private lateinit var btnCat: ImageView
    private lateinit var btnProfile: ImageView
    private lateinit var btnSettings: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgProfile = findViewById<ImageView>(R.id.imgPerfil)
        var imgCerrar = findViewById<ImageView>(R.id.imgCerrar)

        inicializarVistas()
        asignarEventos()
    }

    private fun inicializarVistas(){
        btnCat = findViewById(R.id.imgGato)
        btnProfile = findViewById(R.id.imgPerfil)
        btnSettings = findViewById(R.id.imgSettings)
        btnClose = findViewById(R.id.imgCerrar)
    }

    private fun asignarEventos(){
        btnCat?.setOnClickListener(this)
        btnProfile?.setOnClickListener(this)
        btnSettings?.setOnClickListener(this)
        btnClose?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0?.id){
            R.id.imgCerrar -> {
                finish()
            }
            R.id.imgPerfil ->{
                val s = Intent(this, SolicitarPreferencias::class.java)
                startActivity(s)
                finish()
            }
        }
    }

}