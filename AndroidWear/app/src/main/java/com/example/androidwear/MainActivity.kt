package com.example.androidwear

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.androidwear.databinding.ActivityRelojBinding

class MainActivity : Activity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityRelojBinding
    private var flag: Boolean = false
    private var text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRelojBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtSaludo.text = "Saludo"
        binding.btnCambio.text = "Enviar :D"

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.misOpciones,
            android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Relacionar Spinner con nuestro adapter
        binding.spOpciones.adapter = adapter
        binding.spOpciones.onItemSelectedListener = this

        /*
        binding.btnCambio.setOnClickListener{
            if (flag){
                binding.txtSaludo.text = "Demonios Gump"
            } else {
                binding.txtSaludo.text = "Mae Mia el Bicho"
            }

            flag = !flag
        }
        */

        binding.btnCambio.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Atención")
                .setMessage("Quiere enviar el saludo $text?")
                .setCancelable(false)
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener{dialogInterface, i ->
                        // Aqui el codigo
                        binding.txtSaludo.text = text
                    }
                )
                .setNegativeButton("Cancel",
                    DialogInterface.OnClickListener{dialogInterface, i ->
                        // Aqui va el codigo
                        Toast.makeText(this, "Una lastima :c", Toast.LENGTH_SHORT).show()
                    }
                )
                .show()
        }
    }



    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //TODO("Not yet implemented")
        // p0 => Vista, en este caso el spinner
        // p1 => Son las vistas que se van a repetidas (los items)
        // p2 => Item Seleccionado (Posicion)
        // p3 => id de la Vista

        text = p0?.getItemAtPosition(p2).toString()
        Toast.makeText(this, "Elegiste $text", Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        //TODO("Not yet implemented")
    }
}