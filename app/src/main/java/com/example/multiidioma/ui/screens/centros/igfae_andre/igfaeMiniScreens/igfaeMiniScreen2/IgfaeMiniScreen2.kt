package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen2.contentMiniScreen2.contentIgfaeMiniScreen2Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen2.contentMiniScreen2.contentIgfaeMiniScreen2Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen2.contentMiniScreen2.contentIgfaeMiniScreen2Box3



@Composable
fun IgfaeMiniScreen2(
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
            Box1 = { contentIgfaeMiniScreen2Box1(it) },
            Box2 = { contentIgfaeMiniScreen2Box2(it) },
            Box3 = { contentIgfaeMiniScreen2Box3() })
    }
}