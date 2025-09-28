package com.example.multiidioma.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.example.multiidioma.R

@Composable
fun LottieScrollComponent(debuxoLottie: Int) {
    val scrollState = rememberScrollState()

    // URL del JSON de Lottie
    val url = "https://assets8.lottiefiles.com/packages/lf20_u4yrau.json"
    val url2 = "https://lottie.host/c7e45599-c8f5-4027-a106-16354eddd1c8/snzgHYp2ls.lottie"
    val enRaw = R.raw.figuritas
    // Carga la composición desde la URL
    val composition by rememberLottieComposition(
        //LottieCompositionSpec.Url(url2)
        LottieCompositionSpec.RawRes(debuxoLottie)
    )

    // Normalizamos scroll a valor de animación 0..1
    val scrollProgress = (scrollState.value.toFloat() / scrollState.maxValue.toFloat()).coerceIn(0f, 1f)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        // Espacio arriba para permitir scroll
        repeat(10) { Spacer(modifier = Modifier.height(50.dp)) }

        // Lottie animación
        LottieAnimation(
            composition = composition,
            progress = scrollProgress,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        // Espacio abajo para permitir scroll
        repeat(10) { Spacer(modifier = Modifier.height(50.dp)) }
    }
}
