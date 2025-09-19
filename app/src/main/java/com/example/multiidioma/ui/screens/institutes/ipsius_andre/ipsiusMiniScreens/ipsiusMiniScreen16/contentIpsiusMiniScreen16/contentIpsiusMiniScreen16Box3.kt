package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16.contentIpsiusMiniScreen16


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
fun contentIpsiusMiniScreen16Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    ReusableImage(data, estilosImagen)
    Spacer(modifier = Modifier.height(15.dp))
    LineVerticalComponent(
        color =(Color(0xFFFFFFFF))
    )
}
