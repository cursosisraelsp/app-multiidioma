package com.example.multiidioma.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun SplashUrlImaxenComponent(
    imageRes: String,
    size: Dp = 200.dp,           // tamaño por defecto
    modifier: Modifier = Modifier // permite más modificaciones externas
) {
    Box(
        modifier = modifier.fillMaxSize(),
        //contentAlignment = Alignment.Center
    ) {

        AsyncImage(
            model = imageRes,
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}
