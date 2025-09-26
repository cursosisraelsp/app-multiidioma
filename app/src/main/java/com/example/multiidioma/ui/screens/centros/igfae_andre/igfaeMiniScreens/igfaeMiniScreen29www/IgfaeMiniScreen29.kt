package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen29www


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIgfae
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate


@Composable
fun IgfaeMiniScreen29(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    val url = urlIgfae
    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}



