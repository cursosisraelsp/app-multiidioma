package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
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
fun contentIpsiusMiniScreen14Box3(data: MiniScreenData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        val estilosImagen = StyleImages(
            modifier = Modifier.size(250.dp),
            alignment = Alignment.Center
        )
        ReusableImage(data, estilosImagen)
    }

    LineVerticalComponent(
        color = Color(0xFFFFFFFF),

    )

}
