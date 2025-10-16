/*package com.example.multiidioma.utils

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R

@Composable
fun BotonAbrirFakeCameraActivityUnity() {
    val context = LocalContext.current

    Box(){
        Image(
            painter = painterResource(R.drawable.iconora),
            contentDescription = "icon RA",
            modifier = Modifier.clickable {
                Log.d("RA_DEBUG", "Botón RA presionado")
                //val intent = Intent(context, FakeCameraActivity::class.java)
                //val intent = Intent(context, LoaderUnityActivity::class.java)
                val intent = Intent(context, LoaderUnityActivityMinimal::class.java)
                Log.d("RA_DEBUG", "Botón RA presionado2")
                //val intent = Intent(context, LoaderActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                Log.d("RA_DEBUG", "Botón RA presionado3")
                //val intent = Intent(context, UnityLauncherActivity::class.java)
                // Si el context no es Activity, hace falta esta flag
                /*if (context !is Activity) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }*/
                context.startActivity(intent)
            }
        )
        /*Button(onClick = {
            val intent = Intent(context, FakeCameraActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Abrir Unity")
        }*/
    }

}*/