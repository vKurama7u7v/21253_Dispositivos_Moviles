package com.example.wearosnummayor

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.wearosnummayor.databinding.ActivityMainBinding

class MainActivity : Activity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private var numPrimero: String? = null
    private var numSegundo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.misNumeros,
            android.R.layout.simple_spinner_item
        )

        val adapter2 = ArrayAdapter.createFromResource(
            this,
            R.array.misNumeros,
            android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Relacionar Spinner con nuestro adapter
        binding.spNumPrimary.adapter = adapter
        binding.spNumPrimary.onItemSelectedListener = this

        binding.spNumSecondary.adapter = adapter2
        binding.spNumSecondary.onItemSelectedListener = this

        binding.btnCambio.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Atención")
                .setMessage("Quiere enviar el saludo $numPrimero?")
                .setCancelable(false)
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener{ dialogInterface, i ->
                        // Aqui el codigo
                        binding.txtSaludo.text = numPrimero
                    }
                )
                .setNegativeButton("Cancel",
                    DialogInterface.OnClickListener{ dialogInterface, i ->
                        // Aqui va el codigo
                        Toast.makeText(this, "Una lastima :c", Toast.LENGTH_SHORT).show()
                    }
                )
                .show()
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //TODO("Not yet implemented")
        numPrimero = p0?.getItemAtPosition(p2).toString()
        Toast.makeText(this, "Elegiste $numPrimero", Toast.LENGTH_LONG).show()
    }


    override fun onNothingSelected(p0: AdapterView<*>?) {
        //TODO("Not yet implemented")
    }

}