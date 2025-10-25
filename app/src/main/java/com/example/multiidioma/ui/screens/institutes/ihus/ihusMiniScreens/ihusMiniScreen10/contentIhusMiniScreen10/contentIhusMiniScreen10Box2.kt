package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen10.contentIhusMiniScreen10

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIhusMiniScreen10Box2(
    data: MiniScreenData,
    listState: LazyListState,
    itemIndex: Int
) {
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,

        )
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 25.dp, bottom = 25.dp)
        ) {
            AppText(data, estilosTextos)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
            /*.padding(start = 20.dp, end = 20.dp)*/
        ) {
            LottieScrollWithOffsetComponent(R.raw.ihus_anim_03, listState, itemIndex)
        }
    }
}