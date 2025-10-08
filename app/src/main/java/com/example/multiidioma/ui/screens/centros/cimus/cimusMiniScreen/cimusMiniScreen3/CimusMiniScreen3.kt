package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen3

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
import com.example.multiidioma.ui.screens.centros.cimus.cimusMiniScreen.cimusMiniScreen3.contentCimusMiniScreen3.contentCimusMiniScreen3Box3
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen3.contentCimusMiniScreen3.contentCimusMiniScreen3Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen3.contentCimusMiniScreen3.contentCimusMiniScreen3Box2

@Composable
fun CimusMiniScreen3(
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
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.75f, Box3 = 0.5f),
            data = data,
            Box1 = { contentCimusMiniScreen3Box1() },
            Box2 = { contentCimusMiniScreen3Box2(it)},
            Box3 = { contentCimusMiniScreen3Box3()}
            )
    }
}