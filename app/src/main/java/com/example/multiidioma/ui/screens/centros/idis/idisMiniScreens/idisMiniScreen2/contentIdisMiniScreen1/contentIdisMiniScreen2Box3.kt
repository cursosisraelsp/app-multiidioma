package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen2.contentIdisMiniScreen2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.CircleLineAligmentComponent

@Composable
fun contentIdisMiniScreen2Box3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp),
        horizontalAlignment = Alignment.Start
    ) {
        CircleLineAligmentComponent(
            contentAlignment = Alignment.TopStart, lineHeight = 130.dp
        )
    }

}
