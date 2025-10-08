package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7.contentCimusMiniScreen7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentCimusMiniScreen7Box2(data: MiniScreenData) {

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)

    ) {
        TextBodyMedium(data, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(25.dp))

        ReusableImage(data, estilosImagen)


    }
}