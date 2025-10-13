package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.contentInciforMiniScreen25

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.GifComponent

@Composable
fun contentInciforMiniScreen25Box1(
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GifComponent(gif = R.raw.incifor_anim_pantalla_embajadores)
    }
}
