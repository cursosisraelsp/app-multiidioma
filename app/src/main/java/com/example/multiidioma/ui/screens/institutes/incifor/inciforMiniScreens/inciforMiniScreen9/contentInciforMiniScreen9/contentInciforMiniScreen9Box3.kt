package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent


@Composable
fun contentInciforMiniScreen9Box3(
    data: MiniScreenData, listState: LazyListState,
    itemIndex: Int
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0

    LottieScrollWithOffsetComponent(R.raw.incifor_anim_03, listState, itemIndex)
}