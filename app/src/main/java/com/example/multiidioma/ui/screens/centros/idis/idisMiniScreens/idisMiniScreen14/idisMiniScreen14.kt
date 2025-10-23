package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.contentIdisMiniScreen14.contentIdisMiniScreen14Box1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.contentIdisMiniScreen14.contentIdisMiniScreen14Box2
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.contentIdisMiniScreen14.contentIdisMiniScreen14Box3


@Composable
fun IdisMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.65f, Box3 = 0.15f),
            Box1 = { contentIdisMiniScreen14Box1() },
            Box2 = { contentIdisMiniScreen14Box2(it) },
            Box3 = { contentIdisMiniScreen14Box3() }
        )
    }
}