package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen4Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen4Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen4Box3

@Composable
fun CitiusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.33f, Box2 = 0.33f, Box3 = 0.33f),
            data = data,
            Box1 = { contentCitiusMiniScreen4Box1(it) },
            Box2 = { contentCitiusMiniScreen4Box2(it) },
            Box3 = { contentCitiusMiniScreen4Box3() }
        )
    }
}
