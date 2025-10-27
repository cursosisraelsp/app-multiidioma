package com.example.multiidioma.ui.screens.institutes.ilg.ihusMiniScreens.ilgMiniScreen12.contentIlgMiniScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentSecondDirectiveImageMiniScreen15(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )

    ImageAsincComponent(data, estilosImagen)

}