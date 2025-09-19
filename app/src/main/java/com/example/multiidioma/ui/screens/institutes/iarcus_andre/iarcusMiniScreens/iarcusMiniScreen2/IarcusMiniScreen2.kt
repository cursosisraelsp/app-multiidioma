package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen2.contentMiniScreen2.contentIarcusMiniScreen2Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen2.contentMiniScreen2.contentIarcusMiniScreen2Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen2.contentMiniScreen2.contentIarcusMiniScreen2Box3


@Composable
fun IarcusMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {


    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.5f, Box2 = 0.4f, Box3 = 0.1f),
            Box1 = { contentIarcusMiniScreen2Box1(it) },
            Box2 = { contentIarcusMiniScreen2Box2(it) },
            Box3 = { contentIarcusMiniScreen2Box3() })
    }
}