package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen18


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen18.contentIgfaeMiniScreen18.contentIgfaeMiniScreen18Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen18.contentIgfaeMiniScreen18.contentIgfaeMiniScreen18Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen18.contentIgfaeMiniScreen18.contentIgfaeMiniScreen18Box3


@Composable
fun IgfaeMiniScreen18(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.35f, Box2 = 0.40f, Box3 = 0.25f),
            data = data,
            Box1 = { contentIgfaeMiniScreen18Box1(it) },
            Box2 = { contentIgfaeMiniScreen18Box2(it) },
            Box3 = { contentIgfaeMiniScreen18Box3() })
    }
}



