package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.contentIlgMiniScreen12

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIlgMiniScreen12Box1() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ){
        LineVerticalComponent(contentAlignment = Alignment.Center, color = Color.White)
    }

}