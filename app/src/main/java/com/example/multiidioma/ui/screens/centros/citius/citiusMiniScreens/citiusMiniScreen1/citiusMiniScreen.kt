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
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen1Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen1Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen1Box3

@Composable
fun CitiusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.6f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCitiusMiniScreen1Box1(it) },
            Box2 = { contentCitiusMiniScreen1Box2(it) },
            Box3 = { contentCitiusMiniScreen1Box3() }
        )
    }
}
