package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIgfaeMiniScreen3Box2(data: MiniScreenData,listState: LazyListState,
                                itemIndex: Int) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.Fit
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 50.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Column {
                TextBodyMedium(data, textAlign = TextAlign.Start, index = 0)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            //LottieScrollWithOffsetComponent(
               // debuxoLottie = R.raw.igfae_anim_03,
               // listState = listState,
               // itemIndex = itemIndex,

           // )
        }
    }
}
