package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.contentInciforMiniScreen3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleAligmentComponent

@Composable
fun contentInciforMiniScreen3Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LineCircleAligmentComponent(
            modifier = Modifier.padding(end = 44.dp),
            contentAlignment = Alignment.TopEnd,
            lineHeight = 25.dp,
        )
    }
}
