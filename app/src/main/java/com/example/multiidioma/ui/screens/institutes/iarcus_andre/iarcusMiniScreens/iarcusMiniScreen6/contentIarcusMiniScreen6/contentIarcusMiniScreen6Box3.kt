package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen6.contentIarcusMiniScreen6

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentIarcusMiniScreen6Box3(data: MiniScreenData) {

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(start = 100.dp)
    ) {

        ReusableImage(data, estilosImagen)
    }
}