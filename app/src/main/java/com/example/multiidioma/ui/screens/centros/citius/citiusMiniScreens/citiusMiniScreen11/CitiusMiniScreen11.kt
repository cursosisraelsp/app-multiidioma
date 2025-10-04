package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11

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
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11.contentCitiusMiniScreen11.contentCitiusMiniScreen11Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11.contentCitiusMiniScreen11.contentCitiusMiniScreen11Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11.contentCitiusMiniScreen11.contentCitiusMiniScreen11Box3


@Composable
fun CitiusMiniScreen11(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.75f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCitiusMiniScreen11Box1() },
            Box2 = { contentCitiusMiniScreen11Box2(it) },
            Box3 = { contentCitiusMiniScreen11Box3() }
        )
    }
}
