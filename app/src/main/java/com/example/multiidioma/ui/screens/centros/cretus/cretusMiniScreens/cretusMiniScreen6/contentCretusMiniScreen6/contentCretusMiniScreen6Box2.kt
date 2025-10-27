package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen6.contentCretusMiniScreen6


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentCretusMiniScreen6Box2(data: MiniScreenData) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 30.dp, bottom= 55.dp )

    ) {

        val estiloTextos =
            StyleText(
                style = MaterialTheme.typography.bodyMedium,
                color = (Color(0xFF000000)), textAlign = TextAlign.Center
            );

        AppText(data, estiloTextos, index = 0)

        val estilosImagen = StyleImages(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            alignment = Alignment.BottomCenter
        )
        ImageAsincComponent(data, estilosImagen)
    }
}