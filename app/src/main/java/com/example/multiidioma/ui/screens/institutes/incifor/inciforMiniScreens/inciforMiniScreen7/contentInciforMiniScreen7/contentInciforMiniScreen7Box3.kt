package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent


@Composable
fun contentInciforMiniScreen7Box3(offset: Int, listState: LazyListState, itemIndex: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ) {
        LottieScrollWithOffsetComponent(R.raw.incifor_anim_02, listState, itemIndex)
    }
}