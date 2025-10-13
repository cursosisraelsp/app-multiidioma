package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.contentCitiusMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent

@Composable
fun contentCitiusMiniScreen16Box1(
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GifComponent(gif = R.drawable.citius_anim_02, contentScale = ContentScale.FillBounds)
    }
}