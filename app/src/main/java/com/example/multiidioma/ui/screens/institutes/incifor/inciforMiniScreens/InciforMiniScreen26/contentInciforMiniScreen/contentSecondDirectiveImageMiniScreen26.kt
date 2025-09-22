package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentSecondDirectiveImageMiniScreen26(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 20.dp), alignment = Alignment.BottomCenter
    )

    ReusableImage(data, estilosImagen)

}