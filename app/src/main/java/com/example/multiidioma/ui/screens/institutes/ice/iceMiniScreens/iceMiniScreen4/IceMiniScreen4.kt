package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen4.contentIceMiniScreen4.contentIceMiniScreen4Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen4.contentIceMiniScreen4.contentIceMiniScreen4Box2

@Composable
fun IceMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    listState: LazyListState,
    itemIndex: Int,
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.85f, Box3 = 0f),
            data = data,
            Box1 = { contentIceMiniScreen4Box1() },
            Box2 = { contentIceMiniScreen4Box2(it) },
            )
    }
}