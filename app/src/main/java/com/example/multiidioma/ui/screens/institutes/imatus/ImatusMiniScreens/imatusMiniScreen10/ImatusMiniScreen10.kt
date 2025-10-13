package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10


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
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen10Box1
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen10Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen10Box3

@Composable
fun ImatusMiniScreen10(
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
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.60f, Box3 = 0.3f),
            data = data,
            Box1 = { contentImatusMiniScreen10Box1() },
            Box2 = { contentImatusMiniScreen10Box2(it, offset, listState, itemIndex)},
            Box3 = { contentImatusMiniScreen10Box3() }
        )
    }
}


