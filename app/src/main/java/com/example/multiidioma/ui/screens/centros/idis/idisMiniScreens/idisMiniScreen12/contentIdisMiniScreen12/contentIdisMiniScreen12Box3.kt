package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen12.contentIdisMiniScreen12

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.CircleLineAligmentComponent

@Composable
fun contentIdisMiniScreen12Box3() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircleLineAligmentComponent(
            contentAlignment = Alignment.BottomCenter, lineHeight = 170.dp
        )
    }

}
