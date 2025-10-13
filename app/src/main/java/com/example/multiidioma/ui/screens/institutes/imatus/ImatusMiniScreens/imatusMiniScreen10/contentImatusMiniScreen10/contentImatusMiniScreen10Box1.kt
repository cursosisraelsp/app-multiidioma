package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentImatusMiniScreen10Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end= 50.dp, bottom = 10.dp)
    ) {
        LineVerticalComponent(contentAlignment = Alignment.TopEnd)

    }
}