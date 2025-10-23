package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1.contentCiqusMiniScreen1.contentCiqusMiniScreen1Box1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1.contentCiqusMiniScreen1.contentCiqusMiniScreen1Box2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1.contentCiqusMiniScreen1.contentCiqusMiniScreen1Box3


@Composable
fun ciqusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF32627E))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.75f, Box3 = 0.15f),
            Box1 = { contentCiqusMiniScreen1Box1() },
            Box2 = { contentCiqusMiniScreen1Box2(it) },
            Box3 = { contentCiqusMiniScreen1Box3() }
        )
    }
}