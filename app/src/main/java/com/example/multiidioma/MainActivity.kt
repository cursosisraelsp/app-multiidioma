package com.example.multiidioma

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
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
            MyApp(languageViewModel)
            //MapScreen()
            //AbrirUnity()
            //AbrirUnityConLoader()
            //BotonAbrirUnity()
            //BotonAbrirFakeCameraActivityUnity()
        }
    }
}




@Composable
fun BotonAbrirUnity() {
    val context = LocalContext.current

    Button(onClick = {
        val intent = Intent(context, LoaderUnityActivity::class.java)
        context.startActivity(intent)
    }) {
        Text("Abrir Unity")
    }
}


@Composable
fun AbrirUnity() {
    val context = LocalContext.current
    Button(onClick = {
        val intent = Intent(context, LoaderActivity::class.java)// cargo la ACTIVIDAD CREADA
        context.startActivity(intent)
    }) {
        Text("Abrir Unity")
    }
}

/*

@Composable
fun AbrirUnityConLoader() {
    val context = LocalContext.current
    var mostrarLoader by remember { mutableStateOf(false) }

    // Launcher para pedir permiso de cámara
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted ->
            if (granted) {
                // mostramos loader mientras Unity arranca
                mostrarLoader = true
            } else {
                Toast.makeText(context, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show()
            }
        }
    )

    // Efecto que se dispara cuando mostrarLoader cambia a true
    LaunchedEffect(mostrarLoader) {
        if (mostrarLoader) {
            // Pequeña espera para que el loader se muestre antes de abrir Unity
            kotlinx.coroutines.delay(1000)

            // Lanzamos Unity
            val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
            context.startActivity(intent)

            // Ocultamos loader (opcional, ya que Unity reemplaza la pantalla)
            //mostrarLoader = false
        }
    }

    // UI principal
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (mostrarLoader) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
                Spacer(modifier = Modifier.height(16.dp))
                Text("Cargando Unity...")
            }
        } else {
            Button(
                onClick = {
                    //launcher.launch(Manifest.permission.CAMERA)
                    val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text("Abrir Unity")
            }
        }
    }
}
*/
/*
@Composable
fun AbrirUnityConLoader0() {
    val context = LocalContext.current
    var mostrarLoader by remember { mutableStateOf(false) }

    // Launcher para el permiso de cámara
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted ->
            if (granted) {
                // Mostramos loader antes de abrir Unity
                mostrarLoader = true

                // Pequeño retardo para mostrar el loader (simula precarga)
                Handler(Looper.getMainLooper()).postDelayed({
                    val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                    context.startActivity(intent)

                    // Ocultamos loader después de lanzar Unity
                    mostrarLoader = false
                }, 1000) // 1 segundo, puedes ajustarlo
            } else {
                Toast.makeText(context, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show()
            }
        }
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (mostrarLoader) {
            // Pantalla de carga mientras arranca Unity
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
                Spacer(modifier = Modifier.height(16.dp))
                Text("Cargando Unity...")
            }
        } else {
            // Botón normal
            Button(
                onClick = {
                    //launcher.launch(Manifest.permission.CAMERA)
                    val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text("Abrir Unity")
            }
        }
    }
}

*/

/* -- A primeira
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


 */