package com.example.wearosnummayor

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import com.example.wearosnummayor.databinding.ActivityMainBinding

class MainActivity : Activity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var btnCalcular : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inicializarVistas()
        agregarEventos()
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")

        // Obtener valor de los dos Spinners
        val num1 = binding.spNumPrimary.selectedItem.toString().toInt()
        val num2 = binding.spNumSecondary.selectedItem.toString().toInt()

        // Validaciones ...
            // Omitir ...

        val methods = Methods()

        when(p0?.id) {
            R.id.btnCalcular -> {
                // Al oprimir un botón muestre una alerta que mencione cual spinner
                // contiene el mayor de los números seleccionado por el usuario.
                val alert = AlertDialog.Builder(this)
                alert.setTitle("Atención")
                    .setMessage("¿Desea comparar los 2 valores?")
                    .setCancelable(false)
                    .setPositiveButton("Chi",
                        DialogInterface.OnClickListener{ dialogInterface, i ->
                            if (num1 == num2){
                                Toast.makeText(this, "Los números son iguales", Toast.LENGTH_LONG).show()
                            } else {
                                val mayor = methods.comparar(num1, num2)
                                Toast.makeText(this, "Número mayor = $mayor", Toast.LENGTH_LONG).show()
                            }
                        }
                    )
                    .setNegativeButton("Nel",
                        DialogInterface.OnClickListener{ dialogInterface, i ->
                            Toast.makeText(this, "Una lastima :c", Toast.LENGTH_LONG).show()
                        }
                    )
                    .show()
            }
        }
    }

    private fun inicializarVistas() {
        btnCalcular = binding.btnCalcular
        // Array Adapter
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.misNumeros,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Relacionar Spinner con nuestro adapter
        binding.spNumPrimary.adapter = adapter
        binding.spNumSecondary.adapter = adapter
    }

    private fun agregarEventos(){
        btnCalcular?.setOnClickListener(this)
    }

}