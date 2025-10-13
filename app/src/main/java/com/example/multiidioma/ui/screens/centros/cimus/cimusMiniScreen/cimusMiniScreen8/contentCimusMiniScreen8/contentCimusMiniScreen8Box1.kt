package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen8.contentCimusMiniScreen8

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent


@Composable
fun contentCimusMiniScreen8Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 10.dp)
    ) {
        LineVerticalComponent(color = Color.Black)
    }
}