package com.example.multiidioma.utils.inciforUtils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun LeftColumnIncifor6(data: MiniScreenData, modifier: Modifier = Modifier) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomStart
    )
    Column(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(0.1f)
        ) {
            ReusableImage(data, estilosImagen)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        ) {
            TextBodyMedium(data, index = 0, color = Color.Black)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        ) {
            TextBodyMedium(data, index = 1, color = Color.Black)
        }
        Box(
            modifier = Modifier
                .fillMaxSize(0.2f)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}