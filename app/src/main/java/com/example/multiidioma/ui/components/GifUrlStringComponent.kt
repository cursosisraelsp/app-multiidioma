package com.example.multiidioma.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.request.ImageRequest

@Composable
fun GifUrlStringComponent(modifier: Modifier = Modifier, gif: String, contentScale: ContentScale = ContentScale.Fit) {
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
        imageLoader = imageLoader,
        contentScale = contentScale
    )
}
