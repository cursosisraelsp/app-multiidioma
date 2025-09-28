package com.example.multiidioma.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.example.multiidioma.R

@Composable
fun LottieAutoPlay(debuxoLottie: Int) {
    val url = "https://assets8.lottiefiles.com/packages/lf20_u4yrau.json"
    val url2 = "https://lottie.host/c7e45599-c8f5-4027-a106-16354eddd1c8/snzgHYp2ls.lottie"
    val enRaw = R.raw.figuritas
    val composition by rememberLottieComposition(
        //LottieCompositionSpec.Url(url2)
        LottieCompositionSpec.RawRes(debuxoLottie)
    )
    val progress by animateLottieCompositionAsState(composition, isPlaying = true, iterations = LottieConstants.IterateForever)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(
            composition = composition,
            progress = progress,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
    }
}
