package com.example.multiidioma.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LottieScrollWithOffsetComponent(debuxoLottie: Int,listState: LazyListState,itemIndex: Int) {
    val composition by rememberLottieComposition(
        //LottieCompositionSpec.Url(url2)
        LottieCompositionSpec.RawRes(debuxoLottie)
    )
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
    Column(modifier = Modifier.height(650.dp)) {
        LottieAnimation(
            composition = composition,
            progress = { scrollProgress },
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
    }
}
