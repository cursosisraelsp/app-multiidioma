package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TimelineTemplateBoxUtil


@Composable
fun TimelineTemplate(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Fit,
        alignment = Alignment.BottomStart
    )

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        // Columna izquierda: imagen y textos
        Column(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .fillMaxHeight()
        ) {
            // Imagen superior
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.1f)
                    .padding(start = 40.dp),
            ) {
                ReusableImage(data, estilosImagen)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.6f)
                    .padding(start = 50.dp)
            ) {
                TextBodyMedium(data, index = 0, color = Color.Black)

                SpacerText()

                TextBodyMedium(data, index = 1, color = Color.Black)
            }

            Box(
                modifier = Modifier
                    .fillMaxSize(0.2f)
            ) {
                ReusableImage(data, estilosImagen)
            }
        }

        // Columna derecha: cajas con números + textos
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 10.dp, end = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.33f)
                    .fillMaxWidth()
            ) {
                TimelineTemplateBoxUtil(data, index = 2)
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.66f)
                    .fillMaxWidth()
            ) {
                TimelineTemplateBoxUtil(data, index = 4)
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight(1f)
                    .fillMaxWidth()
            ) {
                TimelineTemplateBoxUtil(data, index = 6)
            }
        }
    }
}
