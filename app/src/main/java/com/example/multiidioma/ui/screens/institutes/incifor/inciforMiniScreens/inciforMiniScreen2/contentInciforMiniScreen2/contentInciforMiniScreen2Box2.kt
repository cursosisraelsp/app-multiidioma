package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.Text.TextBodyMedium


@Composable
fun contentInciforMiniScreen2Box2(data: MiniScreenData, offset: Int) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )
    val estilosTextos =
        StyleText(style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start)

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, end = 50.dp).graphicsLayer {
                    translationY = offset * 0.5f // 👈 efecto parallax
                    translationX = offset * 0.5f
                }
        ) {
            TextBodyMedium(data, estilosTextos)
        }
        //GifComponent(gif = R.drawable.incifor_anim_06)
        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth().height(200.dp)
                .padding(start = 50.dp).graphicsLayer {
                    translationY = offset * 0.5f // 👈 efecto parallax
                    translationX = offset * 0.5f
                }
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}

