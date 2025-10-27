package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.contentCitiusMiniScreen3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentCitiusMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.FillWidth
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.6f)
                .padding(top = 10.dp, start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data, index = 0, textAlign = TextAlign.End)
            SpacerText()
            TextBodyMedium(data, index = 1, textAlign = TextAlign.End)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        ) {
            ImageAsincComponent(data, estilosImagen)

        }
    }
}