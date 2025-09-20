package com.example.multiidioma.utils

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiidioma.R
import com.unity3d.player.UnityPlayerGameActivity
import androidx.activity.ComponentActivity
import androidx.activity.addCallback
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.MainActivity

class UnityLauncherActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Aquí defines tu UI en Compose
            Box(modifier = Modifier.fillMaxSize()) {
                // Por ejemplo, un botón para abrir Unity
                Button(
                    onClick = {
                        val intent = Intent(this@UnityLauncherActivity, com.unity3d.player.UnityPlayerGameActivity::class.java)
                        startActivity(intent)
                    },
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text("Abrir Unity")
                }
            }
        }

        onBackPressedDispatcher.addCallback(this) {
            // Este bloque se ejecuta cuando el usuario pulsa atrás
            val intent = Intent(this@UnityLauncherActivity, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }
    }

}



