package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage


@Composable
fun contentInciforMiniScreen9Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f),
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.FillBounds
    )

    ReusableImage(data, estilosImagen)
}