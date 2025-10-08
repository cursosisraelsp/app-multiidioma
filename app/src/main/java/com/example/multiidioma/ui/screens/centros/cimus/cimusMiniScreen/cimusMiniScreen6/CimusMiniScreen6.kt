package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen6


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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen10.contentCimusMiniScreen10.contentCimusMiniScreen10Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen10.contentCimusMiniScreen10.contentCimusMiniScreen10Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen10.contentCimusMiniScreen10.contentCimusMiniScreen10Box3

@Composable
fun CimusMiniScreen6(
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
            Box1 = { contentCimusMiniScreen10Box1() },
            Box2 = { contentCimusMiniScreen10Box2(it, offset, listState, itemIndex)},
            Box3 = { contentCimusMiniScreen10Box3() }
        )
    }
}


