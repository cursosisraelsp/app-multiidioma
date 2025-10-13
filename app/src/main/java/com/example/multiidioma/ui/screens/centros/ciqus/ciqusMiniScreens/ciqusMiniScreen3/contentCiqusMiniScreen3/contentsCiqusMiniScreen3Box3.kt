package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3.contentCiqusMiniScreen3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCiqusMiniScreen3Box3() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LineVerticalComponent(
            contentAlignment = Alignment.Center
        )
    }

}