package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen4a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen4a.contentCretusMiniScreen4.contentCretusMiniScreen4Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen4a.contentCretusMiniScreen4.contentCretusMiniScreen4Box2
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen4a.contentCretusMiniScreen4.contentCretusMiniScreen4Box3


@Composable
fun CretusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {


        PlantillaScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.30f, Box2 = 0.45f, Box3 = 0.25f),
            Box1 = { contentCretusMiniScreen4Box1() },
            Box2 = { contentCretusMiniScreen4Box2(it) },
            Box3 = { contentCretusMiniScreen4Box3() }
        )
    }
}



