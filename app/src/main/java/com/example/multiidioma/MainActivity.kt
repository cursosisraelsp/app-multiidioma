package com.example.multiidioma

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.ui.screens.mapa.MapScreen
import com.example.multiidioma.viewmodel.LanguageViewModel
import com.unity3d.player.UnityPlayerGameActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val languageViewModel: LanguageViewModel = viewModel()
            //MyApp(languageViewModel)
            //MapScreen()
            AbrirUnity()
        }
    }
}

@Composable
fun AbrirUnity(){
    val context = LocalContext.current  // <-- obtenemos el Context
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                // Lanzamos UnityPlayerActivity
                val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                context.startActivity(intent)
            }
        ) {
            Text("Abrir Unity")
        }
    }
}