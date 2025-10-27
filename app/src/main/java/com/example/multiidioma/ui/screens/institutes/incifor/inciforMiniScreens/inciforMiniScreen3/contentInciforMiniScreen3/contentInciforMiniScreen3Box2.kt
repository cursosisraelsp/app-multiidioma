package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.contentInciforMiniScreen3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentInciforMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter, contentScale = ContentScale.FillBounds

    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.End,
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, bottom = 50.dp, start = 50.dp, end = 50.dp)
    ) {

        AppText(data, estilosTextos)

        Spacer(modifier = Modifier.height(10.dp))

        ImageAsincComponent(data, estilosImagen)
    }
}