package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen1

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
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen1.contentIceMiniScreen1.contentIceMiniScreen1Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen1.contentIceMiniScreen1.contentIceMiniScreen1Box2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen1.contentIceMiniScreen1.contentIceMiniScreen1Box3

@Composable
fun IceMiniScreen1(
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
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.8f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIceMiniScreen1Box1() },
            Box2 = { contentIceMiniScreen1Box2(it, offset, listState, itemIndex) },
            Box3 = { contentIceMiniScreen1Box3() },

        )
    }
}
