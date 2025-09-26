package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen32i.contentCretusMiniScreen32


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentCretusMiniScreen32Box1(data: MiniScreenData){

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    ReusableImage(data , estilosImagen)
}
