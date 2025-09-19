package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen4


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen4.contentIgfaeMiniScreen4.contentIgfaeMiniScreen4Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen4.contentIgfaeMiniScreen4.contentIgfaeMiniScreen4Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen4.contentIgfaeMiniScreen4.contentIgfaeMiniScreen4Box3


@Composable
fun IgfaeMiniScreen4(
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
            Box1 = { contentIgfaeMiniScreen4Box1() },
            Box2 = {contentIgfaeMiniScreen4Box2(it) },
            Box3 = { contentIgfaeMiniScreen4Box3() }
        )
    }
}



