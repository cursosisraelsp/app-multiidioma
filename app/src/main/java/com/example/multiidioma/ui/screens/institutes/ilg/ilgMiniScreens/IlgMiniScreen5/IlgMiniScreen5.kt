package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5

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
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5.contentIlgMiniScreen5.contentIlgMiniScreen5Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5.contentIlgMiniScreen5.contentIlgMiniScreen5Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5.contentIlgMiniScreen5.contentIlgMiniScreen5Box3


@Composable
fun IlgMiniScreen5(
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
            .background(Color(0xFFE5F4F9))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.7f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIlgMiniScreen5Box1() },
            Box2 = { contentIlgMiniScreen5Box2(it, offset, listState, itemIndex) },
            Box3 = { contentIlgMiniScreen5Box3() }
        )
    }
}