package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.contentCitiusMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent

@Composable
fun contentCitiusMiniScreen16Box1(
    offset: Int,
    listState: LazyListState,
    itemIndex: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieScrollWithOffsetComponent(
            debuxoLottie = R.raw.incifor_anim_06,
            listState = listState,
            itemIndex = itemIndex,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
        )
    }
}