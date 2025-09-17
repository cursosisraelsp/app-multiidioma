package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.contenIhusMiniScreen3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleImages
import com.example.multiidioma.data.repository.StyleText
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentIhusMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center, color = Color.Black
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 15.dp, start = 50.dp, end = 50.dp)
    ) {

        TextBodyMedium(data, estilosTextos)

        Spacer(modifier = Modifier.height(5.dp))

        ReusableImage(data, estilosImagen)
    }
}