package com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen14

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIhus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun IhusMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlIhus

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}