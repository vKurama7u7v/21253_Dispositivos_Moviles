package com.example.androidwear

import android.app.Activity
import android.os.Bundle
import com.example.androidwear.databinding.ActivityRelojBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityRelojBinding
    private var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRelojBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtSaludo.text = "Hola Amiguito :D"
        binding.btnCambio.text = "Enviar :D"

        binding.btnCambio.setOnClickListener{
            if (flag){
                binding.txtSaludo.text = "Demonios Gump"
            } else {
                binding.txtSaludo.text = "Mae Mia el Bicho"
            }

            flag = !flag

        }
    }
}