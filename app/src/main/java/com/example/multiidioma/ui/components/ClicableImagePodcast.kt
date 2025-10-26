package com.example.multiidioma.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.multiidioma.data.imaxesJPG
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.data.urlRecursosApp



fun ClickableImagePodcast(context: Context, podcastUrl: Podcast){
    //val context = LocalContext.current
    //val podcastUrl = "https://go.ivoox.com/rf/160621323"
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(podcastUrl.uriIvoox))
    context.startActivity(intent)

    /*Box{
        AsyncImage(
            model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
            contentDescription = "Imagen remota en formato jpeg",
            modifier = Modifier.size(200.dp).background(color = Color.Blue).clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(podcastUrl.uriIvoox))
                context.startActivity(intent)
            },
            contentScale = ContentScale.Crop
        )
        Text("Escuchar en iVoox")
    }*/
}