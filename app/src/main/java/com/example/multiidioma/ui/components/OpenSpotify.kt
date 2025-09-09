package com.example.multiidioma.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.example.multiidioma.data.repository.MultimediaRepository

fun OpenSpotify(context: Context, spotifyUri : MultimediaRepository. Podcast){
    // URI de Spotify (ejemplo: canción específica) Killers
    //val spotifyUri = "spotify:track:3n3Ppam7vgaVa1iaRUc9Lp"
    val intent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse(spotifyUri.uriSpotifyApp)
        putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://${context.packageName}"))
    }
    // Si Spotify no está instalado, abrimos en navegador
    if (intent.resolveActivity(context.packageManager) != null) {
        context.startActivity(intent)
    } else {
        val webIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(spotifyUri.uriSpotifyWeb)
        )
        context.startActivity(webIntent)
    }
}