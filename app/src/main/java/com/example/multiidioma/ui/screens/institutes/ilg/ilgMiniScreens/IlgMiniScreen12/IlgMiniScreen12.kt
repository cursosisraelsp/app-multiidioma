package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.contentIlgMiniScreen12.contentIlgMiniScreen12Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.contentIlgMiniScreen12.contentIlgMiniScreen12Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.contentIlgMiniScreen12.contentIlgMiniScreen12Box3


@Composable
fun IlgMiniScreen12(
   data : MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.67f, Box3 = 0.25f),
            data = data,
            Box1 = { contentIlgMiniScreen12Box1() },
            Box2 = { contentIlgMiniScreen12Box2(it) },
            Box3 = { contentIlgMiniScreen12Box3() }
        )
    }
}
