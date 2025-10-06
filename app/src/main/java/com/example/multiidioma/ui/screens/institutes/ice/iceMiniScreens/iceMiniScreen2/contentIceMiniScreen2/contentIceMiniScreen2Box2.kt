package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen2.contentIceMiniScreen2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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

@Composable
fun contentIceMiniScreen2Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter, contentScale = ContentScale.FillBounds

    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, bottom = 50.dp, start = 50.dp, end = 50.dp)
    ) {

        TextBodyMedium(data, index = 0, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))

        ReusableImage(data, estilosImagen)
    }
}