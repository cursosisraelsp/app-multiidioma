package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen0.contentIceMiniScreen0

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentIceMiniScreen0Box2(
    data: MiniScreenData,
    listState: LazyListState,
    itemIndex: Int
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.graphicsLayer {
            translationY = offset * 0.3f
        }) {
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 0)
            SpacerText()
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 1)
            SpacerText()
            TextBodyMedium(data, textAlign = TextAlign.Center, index = 2)
        }
    }
}
