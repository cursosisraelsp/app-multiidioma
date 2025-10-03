package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.contentCitiusMiniScreen3.contentCitiusMiniScreen3Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.contentCitiusMiniScreen3.contentCitiusMiniScreen3Box2

@Composable
fun CitiusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.95f, Box3 = 0f),
            data = data,
            Box1 = { contentCitiusMiniScreen3Box1() },
            Box2 = { contentCitiusMiniScreen3Box2(it) },
        )
    }
}
