package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen21

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen21.contentCimusMiniScreen21.contentCimusMiniScreen21Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen21.contentCimusMiniScreen21.contentCimusMiniScreen21Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen21.contentCimusMiniScreen21.contentCimusMiniScreen21Box3


@Composable
fun CimusMiniScreen21(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    listState: LazyListState,
    itemIndex: Int
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.40f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCimusMiniScreen21Box1(offset, listState, itemIndex) },
            Box2 = { contentCimusMiniScreen21Box2(it) },
            Box3 = { contentCimusMiniScreen21Box3() }
        )
    }
}
