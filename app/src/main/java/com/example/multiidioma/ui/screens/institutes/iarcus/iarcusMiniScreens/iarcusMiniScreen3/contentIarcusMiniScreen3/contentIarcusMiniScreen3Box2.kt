
package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen3.contentIarcusMiniScreen3



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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun ContentIarcusMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.Fit
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 50.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Column {
                TextBodyMedium(data, textAlign = TextAlign.Start, color = Color.Black, index = 0)
                SpacerText()
                TextBodyMedium(data, textAlign = TextAlign.Start, color = Color.Black, index = 1)
                SpacerText()
            }
        }

        Box(
            modifier = Modifier,
            contentAlignment = Alignment.Center
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}




