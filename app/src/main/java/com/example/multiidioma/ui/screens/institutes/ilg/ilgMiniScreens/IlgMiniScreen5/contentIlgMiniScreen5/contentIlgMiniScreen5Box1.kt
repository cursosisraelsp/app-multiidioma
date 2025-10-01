package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5.contentIlgMiniScreen5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIlgMiniScreen5Box1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        LineVerticalComponent(color = Color.Black, contentAlignment = Alignment.Center)
    }
}