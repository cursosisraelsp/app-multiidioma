package com.example.multiidioma.utils.inciforUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun LeftColumnIncifor6(data: MiniScreenData, modifier: Modifier = Modifier) {
    val estilosImagen =
        StyleImages(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red),
            contentScale = ContentScale.Fit,
            alignment = Alignment.BottomStart

        )
    Column(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.08f)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomStart

        ) {
            ReusableImage(data, estilosImagen)
        }
        Column(
            modifier = Modifier

        ) {
            TextBodyMedium(data, index = 0, color = Color.Black)
        }

        SpacerText()

        Column(
            modifier = Modifier

        ) {
            TextBodyMedium(data, index = 1, color = Color.Black)
        }
        Column(
            modifier = Modifier
                .fillMaxHeight(0.1f)
        ) {
            QuotationMarkIncifor()
        }
    }
}
