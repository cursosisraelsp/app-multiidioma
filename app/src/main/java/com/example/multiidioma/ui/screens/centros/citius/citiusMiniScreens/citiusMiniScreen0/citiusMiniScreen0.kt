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
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen0Box2

@Composable
fun CitiusMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.20f, Box2 = 0.20f, Box3 = 0.60f),
            data = data,
            Box2 = { contentCitiusMiniScreen0Box2(it) },
        )
    }
}
