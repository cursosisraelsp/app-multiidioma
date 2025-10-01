package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.contentIlgMiniScreen7.contentIlgMiniScreen7Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.contentIlgMiniScreen7.contentIlgMiniScreen7Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.contentIlgMiniScreen7.contentIlgMiniScreen7Box3


@Composable
fun IlgMiniScreen7(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.7f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIlgMiniScreen7Box1() },
            Box2 = { contentIlgMiniScreen7Box2(it) },
            Box3 = { contentIlgMiniScreen7Box3() }
        )
    }
}