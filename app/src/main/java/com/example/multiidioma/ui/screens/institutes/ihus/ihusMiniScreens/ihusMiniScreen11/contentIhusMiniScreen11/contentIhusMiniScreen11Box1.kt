package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen11.contentIhusMiniScreen11

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.GifComponent

@Composable
fun contentIhusMiniScreen11Box1(
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GifComponent(gif = R.raw.incifor_anim_pantalla_embajadores) //ihus_anim_04
    }
}
