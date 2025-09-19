package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.contentInciforMiniScreen3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentInciforMiniScreen3Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.FillBounds
    )
    Box(modifier = Modifier.fillMaxSize()) {


        ReusableImage(data, estilosImagen)
    }
}