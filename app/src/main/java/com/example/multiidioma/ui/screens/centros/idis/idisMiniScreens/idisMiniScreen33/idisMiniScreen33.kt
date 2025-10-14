package com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen33

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIdis
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun IdisMiniScreen33(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlIdis

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}