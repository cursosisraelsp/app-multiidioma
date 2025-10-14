package com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen6.contentIarcusMiniScreen6

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIarcusMiniScreen6Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, bottom = 10.dp)
    ) {
        LineVerticalComponent(contentAlignment = Alignment.TopStart)

    }
}