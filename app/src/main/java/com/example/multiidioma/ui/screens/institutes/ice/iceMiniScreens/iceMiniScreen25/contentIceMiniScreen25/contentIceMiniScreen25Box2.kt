package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen25.contentIceMiniScreen25

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentIceMiniScreen25Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.65f)
                .padding(start = 30.dp, end = 30.dp)
        ) {
            TextBodyMedium(data)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(start = 50.dp)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}