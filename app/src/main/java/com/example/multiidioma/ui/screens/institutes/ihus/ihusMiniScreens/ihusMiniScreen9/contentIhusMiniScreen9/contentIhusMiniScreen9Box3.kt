package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.contentIhusMiniScreen9

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent


@Composable
fun contentIhusMiniScreen9Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center
    )

    Column {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
                .padding(bottom = 15.dp)
        ) {
            ImageAsincComponent(data, estilosImagen)
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
        )
        {
           LineVerticalComponent(color = Color.White)
        }
    }
}