package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.contentIdisMiniScreen3.contentIdisMiniScreen3Box1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.contentIdisMiniScreen3.contentIdisMiniScreen3Box2
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.contentIdisMiniScreen3.contentIdisMiniScreen3Box3


@Composable
fun IdisMiniScreen3(
   data : MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.6f, Box3 = 0.35f),
            data = data,
            Box1 = { contentIdisMiniScreen3Box1() },
            Box2 = { contentIdisMiniScreen3Box2(it) },
            Box3 = { contentIdisMiniScreen3Box3(it) }
        )
    }
}
