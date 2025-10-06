package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen13.contentIlgMiniScreen13.contentIlgMiniScreen13Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen13.contentIlgMiniScreen13.contentIlgMiniScreen13Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen13.contentIlgMiniScreen13.contentIlgMiniScreen13Box3


@Composable
fun IlgMiniScreen13(
   data : MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.7f, Box3 = 0.15f),
            data = data,
            Box1 = { contentIlgMiniScreen13Box1() },
            Box2 = { contentIlgMiniScreen13Box2(it) },
            Box3 = { contentIlgMiniScreen13Box3() }
        )
    }
}
