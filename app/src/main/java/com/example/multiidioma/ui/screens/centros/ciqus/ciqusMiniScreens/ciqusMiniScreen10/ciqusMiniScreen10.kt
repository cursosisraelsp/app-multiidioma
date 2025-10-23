package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen10.contentCiqusMiniScreen10.contentCiqusMiniScreen10Box1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen10.contentCiqusMiniScreen10.contentCiqusMiniScreen10Box2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen10.contentCiqusMiniScreen10.contentCiqusMiniScreen10Box3


@Composable
fun ciqusMiniScreen10(
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
            .background(color = Color(0xFFBCE0F0))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.8f, Box3 = 0.1f),
            Box1 = { contentCiqusMiniScreen10Box1() },
            Box2 = { contentCiqusMiniScreen10Box2(it, offset, listState, itemIndex) },
            Box3 = { contentCiqusMiniScreen10Box3() }
        )
    }
}