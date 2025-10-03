package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.contentInciforMiniScreen11

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.SpacerText

@Composable
fun contentInciforMiniScreen11Box2(
    data: MiniScreenData,
    listState: LazyListState,
    itemIndex: Int
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }
    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            TextBodyMedium(data, index = 0, textAlign = TextAlign.Center)
            SpacerText()

            LottieScrollWithOffsetComponent(
                debuxoLottie = R.raw.incifor_anim_04,
                listState = listState,
                itemIndex = itemIndex,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }

        SpacerText()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            TextBodyMedium(data, index = 1, textAlign = TextAlign.Center)
            SpacerText()

            LottieScrollWithOffsetComponent(
                debuxoLottie = R.raw.incifor_anim_06,
                listState = listState,
                itemIndex = itemIndex,
                modifier = Modifier
                    .padding(start = 75.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

