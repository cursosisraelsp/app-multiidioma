package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen35

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlImatus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun ImatusMiniScreen35(data: MiniScreenData, modifier: Modifier) {
    val url = urlImatus

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}