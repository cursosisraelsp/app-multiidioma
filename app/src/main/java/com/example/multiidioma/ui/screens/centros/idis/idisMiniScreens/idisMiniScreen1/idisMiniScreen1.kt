package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.contentIdisMiniScreen1.contentIdisMiniScreen1Box1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.contentIdisMiniScreen1.contentIdisMiniScreen1Box2
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.contentIdisMiniScreen1.contentIdisMiniScreen1Box3
import androidx.compose.ui.graphics.Color


@Composable
fun idisMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF4189B5))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.85f, Box3 = 0f),
            Box1 = { contentIdisMiniScreen1Box1() },
            Box2 = { contentIdisMiniScreen1Box2(it) },
            Box3 = { contentIdisMiniScreen1Box3() }
        )
    }
}