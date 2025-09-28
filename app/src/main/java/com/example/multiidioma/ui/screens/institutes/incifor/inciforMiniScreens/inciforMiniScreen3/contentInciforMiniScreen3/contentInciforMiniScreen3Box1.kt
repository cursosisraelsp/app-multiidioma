package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.contentInciforMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleAligmentComponent
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

@Composable
fun contentInciforMiniScreen3Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LineCircleAligmentComponent(modifier = Modifier.padding(end = 44.dp))
    }
}
