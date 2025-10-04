package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.contentCitiusMiniScreen15

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleMedium


@Composable
fun contentCitiusMiniScreen15Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp)
    ) {
        SpacerText()

        TextTitleMedium(
            data,
            index = 0,
            textAlign = TextAlign.Center,
        ) //Titulo 1

        SpacerText()

        TextBodyMedium(data, index = 1, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(25.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}