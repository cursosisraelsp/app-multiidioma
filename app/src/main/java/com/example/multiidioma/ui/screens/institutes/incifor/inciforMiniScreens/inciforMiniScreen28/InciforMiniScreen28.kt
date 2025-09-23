package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.inciforMiniScreen28

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate

@Composable
fun InciforMiniscreen28(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    ScrollingEndScreenTemplate(
        data = data,
        modifier = modifier,
        buttonTextIndex = 1,
        buttonLink = "https://www.usc.gal/gl/investigar-na-usc/investigar/institutos-centros-investigacion/institutos/INCIFOR"
    )
}