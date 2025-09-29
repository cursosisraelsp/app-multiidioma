package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleAligmentComponent

import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

@Composable
fun contentInciforMiniScreen7Box1() {
    Box(
        modifier = Modifier
    ) {
        LineCircleAligmentComponent(
            lineHeight = 50.dp,
            contentAlignment = Alignment.TopEnd,
            color = Color(0xFF32627E), modifier = Modifier.padding(end = 38.dp),
            thickness = 4.dp
        )

    }
}