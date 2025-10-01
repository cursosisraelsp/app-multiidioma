package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.contentIhusMiniScreen4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

@Composable
fun contentIhusMiniScreen4Box1(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.TopEnd
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp)
    ) {

        LineCircleComponent(color = Color.Black)
    }


}