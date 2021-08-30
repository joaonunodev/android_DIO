package com.joaonunodev.logslivecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("livecycle", "CREATE - estou criando a tela!")
    }

    override fun onStart() {
        super.onStart()
        Log.w("livecycle", "START - deixei a tela visível para o usuário!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("livecycle", "RESUME - agora o usuário pode interagir com o app!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("livecycle", "PAUSE - a tela perdeu o foco,o usuário não pode mais interagir!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("livecycle", "STOP - a tela não está mais visível mas ainda existe!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("livecycle", "RESTART - a tela está retomando o foco!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("livecycle", "DESTROY - a tela foi destruida!")
    }
}