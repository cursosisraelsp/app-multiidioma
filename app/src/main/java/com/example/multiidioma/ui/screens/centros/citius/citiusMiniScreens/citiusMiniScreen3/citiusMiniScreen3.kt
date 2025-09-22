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
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen.contentCitiusMiniScreen.contentCitiusMiniScreen2Box3
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen1Box3
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen3Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen3Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreenA.contentCitiusMiniScreen.contentCitiusMiniScreen3Box3

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
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.65f, Box3 = 0.25f),
            data = data,
            Box1 = { contentCitiusMiniScreen3Box1() },
            Box2 = { contentCitiusMiniScreen3Box2(it) },
            Box3 = { contentCitiusMiniScreen3Box3(it) }
        )
    }
}
