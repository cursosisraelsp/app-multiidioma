package com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13.contentCiqusMiniScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
@Composable
fun contentSecondDirectiveImageMiniScreen13(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )

    ReusableImage(data, estilosImagen)

}