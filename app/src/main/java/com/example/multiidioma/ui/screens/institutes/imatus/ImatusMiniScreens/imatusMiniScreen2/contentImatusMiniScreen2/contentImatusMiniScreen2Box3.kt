package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.contentImatusMiniScreen2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentImatusMiniScreen2Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 15.dp, end = 15.dp),
        verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageAsincComponent(data, estilosImagen)
    }
}