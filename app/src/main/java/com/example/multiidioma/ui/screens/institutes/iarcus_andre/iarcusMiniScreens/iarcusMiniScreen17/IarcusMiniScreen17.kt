package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen17


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen17.contentIarcusMiniScreen17.contentIarcusMiniScreen17Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen17.contentIarcusMiniScreen17.contentIarcusMiniScreen17Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen17.contentIarcusMiniScreen17.contentIarcusMiniScreen17Box3


@Composable
fun IarcusMiniScreen17(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.20f, Box2 = 0.60f, Box3 = 0.20f),
            data = data,
            Box1 = { contentIarcusMiniScreen17Box1() },
            Box2 = { contentIarcusMiniScreen17Box2(it) },
            Box3 = { contentIarcusMiniScreen17Box3()})
    }
}



