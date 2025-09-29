package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.contenIlgMiniScreen3.contentIlgMiniScreen3Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.contenIlgMiniScreen3.contentIlgMiniScreen3Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.contenIlgMiniScreen3.contentIlgMiniScreen3Box3


@Composable
fun IlgMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.6f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIlgMiniScreen3Box1(it) },
            Box2 = { contentIlgMiniScreen3Box2(it) },
            Box3 = { contentIlgMiniScreen3Box3() }
        )
    }
}