package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen28

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlCimus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun CimusMiniScreen30(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlCimus

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}