package com.example.multiidioma.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.request.ImageRequest
import androidx.compose.ui.platform.LocalContext

@Composable
fun GifComponent(modifier: Modifier = Modifier, gif: Int) {
    val context = LocalContext.current

    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(GifDecoder.Factory()) // soporte para GIFs
        }
        .build()

    AsyncImage(
        model = ImageRequest.Builder(context)
            .data(gif)//
            .build(),
        contentDescription = "Animación GIF",
        modifier = modifier,
        imageLoader = imageLoader
    )
}
