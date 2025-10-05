package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16.contentIpsiusMiniScreen16






import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.TextBodyMedium


@Composable
fun contentIpsiusMiniScreen16Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )
    val estiloText = StyleText(
        style = TextStyle(),
        textAlign = TextAlign.Center,
        color = Color.Black
    )

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data,estiloText)
            SpacerText()
            TextBodyMedium(data,estiloText)
        }

        SpacerText()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, end = 100.dp)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}