package com.joaonunodev.calculadoranotas

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.joaonunodev.calculadoranotas.databinding.ActivityMainBinding
import java.io.StringBufferInputStream

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcula.setOnClickListener {

            val nota1 : Float = binding.nota1.text.toString().toFloat()
            val nota2 : Float = binding.nota2.text.toString().toFloat()
            val faltas : Int = binding.faltas.text.toString().toInt()

            val resultado : Float = (nota1+nota2)/2

            val texto: String = if (resultado > 5 && faltas < 10) {
                "Aprovado" + "\n" + "Resultado: " + resultado + "\n" + "Faltas: " + faltas
            } else {
                "Reprovado" + "\n" + "Resultado: " + resultado + "\n" + "Faltas: " + faltas
            }
            binding.resultado.text = texto

        }
    }
}