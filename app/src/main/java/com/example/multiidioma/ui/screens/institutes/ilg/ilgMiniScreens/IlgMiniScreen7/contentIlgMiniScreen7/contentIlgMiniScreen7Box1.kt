package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.contentIlgMiniScreen7

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIlgMiniScreen7Box1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 50.dp)
    ) {
        LineVerticalComponent(color = Color.Black, contentAlignment = Alignment.TopEnd)
    }
}