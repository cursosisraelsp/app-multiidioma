package com.example.multiidioma.utils


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CircleForLineCircle(
    color: Color = Color.White,
) {
    Box(
        modifier = Modifier
            .size(15.dp), // ⬅️ CAMBIA ESTE VALOR para que coincida con el otro círculo
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val radius = size.minDimension / 2
            drawCircle(
                color = color,
                radius = radius,
                center = Offset(size.width / 2, size.height / 2)
            )
        }
    }
}