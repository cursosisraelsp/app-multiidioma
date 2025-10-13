package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1.contentCiqusMiniScreen1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCiqusMiniScreen1Box3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LineVerticalComponent(
            contentAlignment = Alignment.BottomStart
        )
    }

}