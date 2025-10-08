package com.example.multiidioma.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LineForCircle(
    color: Color = Color.White,
    height: Dp = 100.dp,
    thickness: Dp = 3.dp
) {
    Box(
        modifier = Modifier
            .width(thickness)
            .height(height)
            .background(color)
    )
}