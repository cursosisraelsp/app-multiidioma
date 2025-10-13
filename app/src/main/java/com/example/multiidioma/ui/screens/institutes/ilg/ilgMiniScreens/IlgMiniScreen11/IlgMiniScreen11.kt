package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen11

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen11.contentIlgMiniScreen11.contentIlgMiniScreen11Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen11.contentIlgMiniScreen11.contentIlgMiniScreen11Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen11.contentIlgMiniScreen11.contentIlgMiniScreen11Box3


@Composable
fun IlgMiniScreen11(
   data : MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.65f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIlgMiniScreen11Box1() },
            Box2 = { contentIlgMiniScreen11Box2(it) },
            Box3 = { contentIlgMiniScreen11Box3() }
        )
    }
}
