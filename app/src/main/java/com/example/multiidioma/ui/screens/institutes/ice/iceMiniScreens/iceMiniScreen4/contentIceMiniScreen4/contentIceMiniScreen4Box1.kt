package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen4.contentIceMiniScreen4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIceMiniScreen4Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LineVerticalComponent(
            modifier = Modifier.padding(end = 37.8.dp),
            contentAlignment = Alignment.TopEnd,
            color = Color.Black,


        )
    }
}