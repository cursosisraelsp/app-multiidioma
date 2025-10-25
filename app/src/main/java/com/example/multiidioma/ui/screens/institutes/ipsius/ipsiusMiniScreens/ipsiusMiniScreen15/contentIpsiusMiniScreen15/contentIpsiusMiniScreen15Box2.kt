package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15


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
fun contentIpsiusMiniScreen15Box2(
    data: MiniScreenData, listState: LazyListState,
    itemIndex: Int,
) {
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
                TextBodyMedium(data, textAlign = TextAlign.End, index = 0)
                Spacer(modifier = Modifier.height(10.dp))
                TextBodyMedium(data, textAlign = TextAlign.End, index = 1)
            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 100.dp),

            contentAlignment = Alignment.Center
        ) {
           // LottieScrollWithOffsetComponent(
               // debuxoLottie = R.raw.ipsius_anim_04,
              //  listState = listState,
              //  itemIndex = itemIndex,


               // )
        }
    }
}
