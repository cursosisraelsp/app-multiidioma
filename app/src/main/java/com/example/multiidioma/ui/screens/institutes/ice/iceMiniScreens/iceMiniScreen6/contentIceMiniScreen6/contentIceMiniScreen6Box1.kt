package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6.contentIceMiniScreen6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleAligmentComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIceMiniScreen6Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 20.dp)
            .background(Color(0xFF32627E))
    ) {
        LineVerticalComponent(contentAlignment = Alignment.Center)
    }
}