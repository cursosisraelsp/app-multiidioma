package com.example.multiidioma.ui.screens.institutes.ice.iceMiniScreens.iceMiniScreen3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.iceUtils.TimelineTemplateIce

@Composable
fun IceMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    TimelineTemplateIce(
        data = data,
        modifier = modifier.fillMaxSize(),
        color = Color(0xFFBCE0F0)
    )
}