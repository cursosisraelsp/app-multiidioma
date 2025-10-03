package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.contentCitiusMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleAligmentComponent


@Composable
fun contentCitiusMiniScreen3Box1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 44.dp)
    ) {
        LineCircleAligmentComponent(contentAlignment = Alignment.TopEnd)
    }
}
