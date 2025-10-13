package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13.contentIdisMiniScreen13.contentIdisMiniScreen13Box1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13.contentIdisMiniScreen13.contentIdisMiniScreen13Box2
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13.contentIdisMiniScreen13.contentIdisMiniScreen13Box3


@Composable
fun IdisMiniScreen13(
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
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.8f, Box3 = 0.05f),
            Box1 = { contentIdisMiniScreen13Box1() },
            Box2 = { contentIdisMiniScreen13Box2(it) },
            Box3 = { contentIdisMiniScreen13Box3() }
        )
    }
}