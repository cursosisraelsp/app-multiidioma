package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen11.contentCiqusMiniScreen11

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCiqusMiniScreen11Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
         LineCircleComponent(color = Color.Black)

        }
    }
}