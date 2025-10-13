package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen1.contentCitiusMiniScreen1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentCitiusMiniScreen1Box2(data: MiniScreenData) {

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }

}