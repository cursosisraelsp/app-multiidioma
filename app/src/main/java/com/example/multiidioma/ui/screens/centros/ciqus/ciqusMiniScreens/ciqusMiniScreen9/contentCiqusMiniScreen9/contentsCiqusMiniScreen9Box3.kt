package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.contentCiqusMiniScreen9

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCiqusMiniScreen9Box3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LineVerticalComponent(
            contentAlignment = Alignment.BottomEnd
        )
    }

}