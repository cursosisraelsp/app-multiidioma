package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.contentIdisMiniScreen16

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.GifComponent

@Composable
fun contentIdisMiniScreen16Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GifComponent(gif = R.drawable.idis_anim_06, contentScale = ContentScale.FillBounds)
    }
}