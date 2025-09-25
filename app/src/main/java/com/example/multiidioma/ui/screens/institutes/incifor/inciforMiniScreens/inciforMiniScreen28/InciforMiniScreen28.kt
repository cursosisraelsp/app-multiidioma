package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen28

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIncifor
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun InciforMiniscreen28(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlIncifor

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}