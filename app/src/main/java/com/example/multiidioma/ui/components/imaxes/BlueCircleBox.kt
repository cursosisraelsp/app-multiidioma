package com.example.multiidioma.ui.components.imaxes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BlueCircleCanvas(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .size(200.dp) // tamaño del círculo
    ) {
        drawCircle(
            color = Color(0xFF2196F3), // azul del PNG
            radius = size.minDimension / 2
        )
    }
}
