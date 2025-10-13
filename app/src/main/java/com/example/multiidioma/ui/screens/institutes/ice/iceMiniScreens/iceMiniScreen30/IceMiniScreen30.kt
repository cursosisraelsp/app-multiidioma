package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen30

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIce
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun IceMiniScreen30(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlIce

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}