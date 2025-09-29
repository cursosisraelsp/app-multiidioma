package com.example.multiidioma.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.example.multiidioma.R

@Composable
fun LottieScrollWithOffsetComponent(debuxoLottie: Int,listState: LazyListState,itemIndex: Int) {
    //val scrollState = rememberScrollState()


    // Carga la composición desde la URL
    val composition by rememberLottieComposition(
        //LottieCompositionSpec.Url(url2)
        LottieCompositionSpec.RawRes(debuxoLottie)
    )

    // Normalizamos scroll a valor de animación 0..1
    //val scrollProgress = (scrollState.value.toFloat() / scrollState.maxValue.toFloat()).coerceIn(0f, 1f)
    //val scrollProgress = (offset.toFloat() / 600f).coerceIn(0f, 1f)
    // Estado reactivo que se recalcula al hacer scroll
    val scrollProgress by remember {
        derivedStateOf {
            val firstVisible = listState.firstVisibleItemIndex
            val scrollOffset = listState.firstVisibleItemScrollOffset

            // Si este item es visible, calculamos su progreso
            if (firstVisible <= itemIndex) {
                (scrollOffset.toFloat() / 600f).coerceIn(0f, 1f)
            } else {
                0f
            }
        }
    }
    Column(
        modifier = Modifier
            //.border(width = 1.dp, color = Color.Black)
            //.height(650.dp)
            //.fillMaxSize()
            //.verticalScroll(scrollState)
            //.padding(16.dp)
    ) {
        // Espacio arriba para permitir scroll
        //repeat(10) { Spacer(modifier = Modifier.height(50.dp)) }

        // Lottie animación
        LottieAnimation(
            composition = composition,
            progress = { scrollProgress },
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        // Espacio abajo para permitir scroll
        //repeat(10) { Spacer(modifier = Modifier.height(50.dp)) }
    }
}
