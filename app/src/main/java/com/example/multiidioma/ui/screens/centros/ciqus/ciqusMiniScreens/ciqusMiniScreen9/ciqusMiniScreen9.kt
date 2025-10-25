package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9

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
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.contentCiqusMiniScreen9.contentCiqusMiniScreen9Box1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.contentCiqusMiniScreen9.contentCiqusMiniScreen9Box2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.contentCiqusMiniScreen9.contentCiqusMiniScreen9Box3


@Composable
fun ciqusMiniScreen9(
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
            .background(color = Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.75f, Box3 = 0.15f),
            Box1 = { contentCiqusMiniScreen9Box1() },
            Box2 = { contentCiqusMiniScreen9Box2(it, offset, listState, itemIndex) },
            Box3 = { contentCiqusMiniScreen9Box3() }
        )
    }
}