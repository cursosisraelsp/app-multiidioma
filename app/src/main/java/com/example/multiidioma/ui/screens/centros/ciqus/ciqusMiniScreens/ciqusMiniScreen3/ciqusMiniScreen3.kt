package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3.contentCiqusMiniScreen3.contentCiqusMiniScreen3Box1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3.contentCiqusMiniScreen3.contentCiqusMiniScreen3Box2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3.contentCiqusMiniScreen3.contentCiqusMiniScreen3Box3


@Composable
fun ciqusMiniScreen3(
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
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.7f, Box3 = 0.2f),
            Box1 = { contentCiqusMiniScreen3Box1() },
            Box2 = { contentCiqusMiniScreen3Box2(it) },
            Box3 = { contentCiqusMiniScreen3Box3() }
        )
    }
}