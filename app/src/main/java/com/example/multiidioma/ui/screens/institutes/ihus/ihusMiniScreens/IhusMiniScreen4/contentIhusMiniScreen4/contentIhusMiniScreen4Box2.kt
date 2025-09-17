package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.contentIhusMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleImages
import com.example.multiidioma.data.repository.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentIhusMiniScreen4Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter, contentScale = ContentScale.Crop
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center, color = Color.Black
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
            .fillMaxSize()
                .fillMaxWidth()
                .weight(0.4f))
        {TextBodyMedium(data, estilosTextos)}
        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .weight(0.6f))

        { ReusableImage(data, estilosImagen)}


    }
}