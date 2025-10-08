package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.contentIdisMiniScreen3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIdisMiniScreen3Box1() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 56.dp),
        horizontalAlignment = Alignment.Start
    ){
        LineVerticalComponent(contentAlignment = Alignment.TopStart, color = Color.White)
    }

}