package com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen14

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlCiqus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun CiqusMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlCiqus

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}