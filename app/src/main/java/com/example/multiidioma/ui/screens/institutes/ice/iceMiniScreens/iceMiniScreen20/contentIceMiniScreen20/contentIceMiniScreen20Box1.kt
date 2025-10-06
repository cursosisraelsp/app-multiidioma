package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20.contentIceMiniScreen20

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent


@Composable
fun contentIceMiniScreen20Box1(data: MiniScreenData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
    ) {
        LineVerticalComponent()
    }

}


