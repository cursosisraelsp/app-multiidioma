package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14






import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIpsiusMiniScreen14Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
        alignment = Alignment.BottomStart,
        contentScale = ContentScale.Fit
    )

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(horizontal = 50.dp),

            contentAlignment = Alignment.TopStart
        ) {
            Column {

                Box(modifier = Modifier.padding(top = 20.dp)) {
                    TextBodyMedium(data, textAlign = TextAlign.Center, index = 0)
                }

                Spacer(modifier = Modifier.height(10.dp))

                TextBodyMedium(data, textAlign = TextAlign.Center, index = 1)
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding (start = 180.dp),

            contentAlignment = Alignment.Center
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}
