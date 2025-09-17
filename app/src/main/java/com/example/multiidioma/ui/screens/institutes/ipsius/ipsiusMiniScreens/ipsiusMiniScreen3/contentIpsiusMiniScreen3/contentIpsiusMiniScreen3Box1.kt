package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen3.contentIpsiusMiniScreen3



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun ContentIpsiusMiniScreen3Box1(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .size(60.dp)
            .padding(start = 10.dp, top = 10.dp),
        alignment = Alignment.TopStart
    )
    val estilosTextos =
        StyleText(
            style = MaterialTheme.typography.bodyMedium,
            color = (Color(0xFF000000)),
            textAlign = TextAlign.Start
        )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Row {

            ReusableImage(data, estilosImagen)


            TextBodyMedium(data, estilosTextos)
        }
    }
}


