package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen8.contentImatusMiniScreen8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentImatusMiniScreen8Box2(
    data: MiniScreenData,
    offset: Int,
    listState: LazyListState,
    itemIndex: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            LottieScrollWithOffsetComponent(R.raw.imatus_anim_01, listState, itemIndex)
        }
        SpacerText()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            TextBodyMedium(data, index = 0,)

            SpacerText()

            TextBodyMedium(data, index = 1,)
        }

    }
}
