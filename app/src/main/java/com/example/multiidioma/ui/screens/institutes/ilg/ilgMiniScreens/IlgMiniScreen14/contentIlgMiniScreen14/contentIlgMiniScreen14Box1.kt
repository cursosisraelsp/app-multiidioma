package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen14.contentIlgMiniScreen14

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
fun contentIlgMiniScreen14Box1(

    ) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GifComponent(gif = R.drawable.ilg_anim_05, contentScale = ContentScale.Fit)
    }
}