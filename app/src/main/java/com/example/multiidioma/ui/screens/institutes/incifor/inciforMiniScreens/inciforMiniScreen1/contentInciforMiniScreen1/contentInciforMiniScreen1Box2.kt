package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
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
fun contentInciforMiniScreen1Box2(data: MiniScreenData, offset: Int,listState: LazyListState,itemIndex: Int) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)
        /*.background(Color.Green)*/

    ) {
        Box(modifier = Modifier.height(200.dp).graphicsLayer {
            translationY = offset * 0.3f // 👈 efecto parallax
            //translationX = offset * 0.5f
        }) {
            TextBodyMedium(data, estilosTextos)
        }
        Spacer(modifier = Modifier.height(25.dp))
        GifComponent(gif = R.drawable.incifor_anim_06)
        LottieScrollWithOffsetComponent(R.raw.figuritas,listState,itemIndex)
        Box(modifier = Modifier.height(200.dp).graphicsLayer {
            translationY = offset * 0.3f // 👈 efecto parallax
            //translationX = offset * 0.5f
        }){
            ReusableImage(data, estilosImagen)
        }



    }
}