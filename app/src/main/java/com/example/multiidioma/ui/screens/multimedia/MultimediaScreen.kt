package com.example.multiidioma.ui.screens.multimedia

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R
import android.net.Uri

@Composable
fun MultimediaScreen(){
    val context = LocalContext.current


    Box(modifier = Modifier.clickable {
        // URI de Spotify (ejemplo: canción específica) Killers
        val spotifyUri = "spotify:track:3n3Ppam7vgaVa1iaRUc9Lp"
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(spotifyUri)
            putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://${context.packageName}"))
        }
        // Si Spotify no está instalado, abrimos en navegador
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        } else {
            val webIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://open.spotify.com/track/3n3Ppam7vgaVa1iaRUc9Lp")
            )
            context.startActivity(webIntent)
        }
    }){
        Image(painterResource(R.drawable.bgalega), contentDescription = "bandeira")
    }
}