package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen4.contentIlgMiniScreen4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIlgMiniScreen4Box1(data: MiniScreenData) {
    val estilosTextos =
        StyleText(
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {


        LineVerticalComponent(color = Color.Black)

    }
}