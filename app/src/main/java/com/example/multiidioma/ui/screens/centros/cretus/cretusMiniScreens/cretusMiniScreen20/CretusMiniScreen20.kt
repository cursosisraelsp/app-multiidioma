package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen20


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen

import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen20.contentCretusMiniScreen20.contentCretusMiniScreen20Box1
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen20.contentCretusMiniScreen20.contentCretusMiniScreen20Box2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen20.contentCretusMiniScreen20.contentCretusMiniScreen20Box3


@Composable
fun CretusMiniScreen20(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.80f, Box3 = 0.10f),
            data = data,
            Box1 = { contentCretusMiniScreen20Box1() },
            Box2 = { contentCretusMiniScreen20Box2(it) },
            Box3 = { contentCretusMiniScreen20Box3() })
    }
}