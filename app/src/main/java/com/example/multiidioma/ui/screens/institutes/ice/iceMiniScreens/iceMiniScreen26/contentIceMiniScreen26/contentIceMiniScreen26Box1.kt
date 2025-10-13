package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen26.contentIceMiniScreen26

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent

@Composable
fun contentIceMiniScreen26Box1(
    offset: Int,
    listState: LazyListState,
    itemIndex: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LottieScrollWithOffsetComponent(
            debuxoLottie = R.raw.ice_anim_03,
            listState = listState,
            itemIndex = itemIndex,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}
