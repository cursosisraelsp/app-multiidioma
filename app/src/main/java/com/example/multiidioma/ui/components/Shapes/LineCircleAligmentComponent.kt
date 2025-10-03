package com.example.multiidioma.ui.components.Shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.multiidioma.utils.CircleForLineCircle
import com.example.multiidioma.utils.LineForCircle

@Composable
fun LineCircleAligmentComponent(
    contentAlignment: Alignment = Alignment.TopEnd,
    color: Color = Color.White,
    modifier: Modifier = Modifier,
    lineHeight: Dp = 25.dp,
    thickness: Dp = 3.dp
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = contentAlignment
    ) {
        // ⬇️ Agrupamos en una columna pero sin limitar el ancho al de la línea
        Column(
            modifier = Modifier.wrapContentSize(), // Antes: wrapContentHeight()
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Línea
            LineForCircle(color = color, height = lineHeight, thickness = thickness)

            Spacer(modifier = Modifier.height(8.dp))

            // Círculo con tamaño libre
            CircleForLineCircle(color = color)
        }
    }
}