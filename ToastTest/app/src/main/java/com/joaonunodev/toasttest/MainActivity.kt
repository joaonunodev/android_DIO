package com.joaonunodev.toasttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.joaonunodev.toasttest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // binding.textView2.text = "Mudar texto 2"

        /* para aceder ao botão e apresentar uma mensagem de Toast
        binding.toastButton.setOnClickListener {
            Toast.makeText(this, "Experiencia 1 Toast", Toast.LENGTH_LONG).show()
        }*/

        /*para aceder ao botão e escrever um texto em id/textView2

        val texto2 : String = "Experiencia 2 agora vamos apresentar este texto"

        binding.toastButton.setOnClickListener {
            binding.textView2.text = texto2
        } */

        // vamos ler o texto em InputText e escrever em id/textView2

        binding.toastButton.setOnClickListener {
            val texto3 : String = binding.textInput.text.toString()
            binding.textView2.text = texto3
        }








        

    }
}