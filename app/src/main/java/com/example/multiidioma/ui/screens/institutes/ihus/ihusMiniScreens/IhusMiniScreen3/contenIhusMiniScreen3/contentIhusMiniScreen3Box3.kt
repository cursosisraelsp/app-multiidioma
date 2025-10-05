package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.contenIhusMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIhusMiniScreen3Box3() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LineVerticalComponent(contentAlignment = Alignment.Center, color = Color.Black)
    }
}