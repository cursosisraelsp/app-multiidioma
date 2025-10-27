package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.contentIdisMiniScreen1


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun contentIdisMiniScreen1Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center, contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
                .padding(start = 50.dp, top = 15.dp, end = 50.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
               .padding(start = 50.dp, end = 50.dp)
        )

        {
            AppText(data, estilosTextos, index = 1)

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.6f)
        ) {

            ImageAsincComponent(data, estilosImagen)
        }

    }
}