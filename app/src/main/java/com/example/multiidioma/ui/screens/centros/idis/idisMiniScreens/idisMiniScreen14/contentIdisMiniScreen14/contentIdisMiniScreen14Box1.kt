package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.contentIdisMiniScreen14

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIdisMiniScreen14Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 50.dp),
        ) {
        LineVerticalComponent(contentAlignment = Alignment.TopEnd)
    }
}