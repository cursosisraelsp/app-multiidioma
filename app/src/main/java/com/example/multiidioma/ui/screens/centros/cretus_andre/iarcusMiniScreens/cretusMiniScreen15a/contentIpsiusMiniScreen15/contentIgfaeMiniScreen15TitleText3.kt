package com.example.multiidioma.ui.screens.centros.cretus_andre.CretusMiniScreens.cretusMiniScreen15a.contentIpsiusMiniScreen15


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCretusMiniScreen15Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .padding(top = 10.dp)
            .size(250.dp),
        alignment = Alignment.CenterStart
    )
    ReusableImage(data, estilosImagen)
    LineVerticalComponent(
        color = (Color(0xFFFFFFFF))
    )
}
