package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16.contentIceMiniScreen16

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleMedium
import com.example.multiidioma.utils.TextTitleMediumRegular


@Composable
fun contentIceMiniScreen16Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, bottom = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerText()

        TextTitleMedium(data, index = 0, textAlign = TextAlign.Center) //Titulo 1
        TextTitleMediumRegular(data, index = 1, textAlign = TextAlign.Center) //Titulo 2
        SpacerText()

        Spacer(modifier = Modifier.height(25.dp))
        LineVerticalComponent(modifier = Modifier.fillMaxHeight(0.1f))

        Spacer(modifier = Modifier.height(25.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
        ) {
            ReusableImage(data, estilosImagen)
        }
        Spacer(modifier = Modifier.height(5.dp))

        TextBodyMedium(data, index = 2, textAlign = TextAlign.Center)

    }
}