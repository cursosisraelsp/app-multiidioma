package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
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
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.R

@Composable
fun contentInciforMiniScreen24Box2(
    data: MiniScreenData,
    offset: Int,
    listState: LazyListState,
    itemIndex: Int
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {
            LottieScrollWithOffsetComponent(
                debuxoLottie = R.raw.incifor_anim_05,
                listState = listState,
                itemIndex = itemIndex,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}