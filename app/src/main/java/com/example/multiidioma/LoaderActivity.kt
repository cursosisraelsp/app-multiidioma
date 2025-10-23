package com.example.multiidioma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class LoaderActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LoaderScreen()
        }

       /* // Lanzamos Unity después de un pequeño retardo
        lifecycleScope.launch {
            delay(1000) // aquí ajusta si quieres que se vea más
            val intent = Intent(this@LoaderActivity, com.unity3d.player.UnityPlayerGameActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // crea otra task separada
            //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
            //finish() // Cerramos LoaderActivity para no volver atrás a ella
        }*/
    }
}

@Composable
fun LoaderScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator()
            Spacer(modifier = Modifier.height(16.dp))
            Text("Cargando Unity...")
        }
    }
}
