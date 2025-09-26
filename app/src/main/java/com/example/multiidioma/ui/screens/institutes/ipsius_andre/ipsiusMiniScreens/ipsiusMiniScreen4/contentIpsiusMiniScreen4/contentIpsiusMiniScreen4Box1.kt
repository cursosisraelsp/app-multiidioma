package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen4.contentIpsiusMiniScreen4

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIpsiusMiniScreen4Box1() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LineVerticalComponent(modifier = Modifier
            .padding(start = 50.dp), contentAlignment = Alignment.TopStart, color = (Color(0xFF000000)))
    }
}
