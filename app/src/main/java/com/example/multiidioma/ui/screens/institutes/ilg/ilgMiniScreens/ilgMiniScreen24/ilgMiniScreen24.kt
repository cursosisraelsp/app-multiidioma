package com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen24

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIhus
import com.example.multiidioma.data.urlIlg
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun IlgMiniScreen24(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    val url = urlIlg

    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}