package com.example.examenparcial2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
/*import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenparcial2.adapters.OptionsAdapter
import com.example.examenparcial2.models.MenuOptions

 */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnCat: Button? = null
    private var btnProfile: Button? = null
    private var btnSettings: Button? = null
    private var btnClose: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val options = MenuOptions().getMenuOptions()
        val recycler = findViewById<RecyclerView>(R.id.RecyclerViewMenu)

        var administradorDeLayouts = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)
        recycler.layoutManager = administradorDeLayouts
        recycler.adapter = OptionsAdapter(options, this)

         */

        inicializarVistas()
        asignarEventos()
    }

    // Menu Icons
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_icons, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun inicializarVistas(){

        btnCat = findViewById(R.id.MenuOptionCat)
        btnProfile = findViewById(R.id.MenuOptionProfile)
        btnSettings = findViewById(R.id.MenuOptionSettings)
        btnClose = findViewById(R.id.MenuOptionClose)
    }

    private fun asignarEventos(){
        btnCat?.setOnClickListener(this)
        btnProfile?.setOnClickListener(this)
        btnSettings?.setOnClickListener(this)
        btnClose?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
    }
}