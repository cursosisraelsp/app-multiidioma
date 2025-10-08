package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen2.contentCimusMiniScreen2


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun contentCimusMiniScreen2Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 40.dp, end = 40.dp)
        ) {
            TextBodyMedium(data)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 100.dp, top = 20.dp)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}

