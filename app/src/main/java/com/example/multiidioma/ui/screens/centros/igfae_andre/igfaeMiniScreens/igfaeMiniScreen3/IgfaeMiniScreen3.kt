package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box3

@Composable
fun IgfaeMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()

            .background(Color(0xFFBCE0F0))
    ) {


        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.54f, Box3 = 0.01f),
            data = data,
            Box1 = { contentIgfaeMiniScreen3Box1() },
            Box2 = { contentIgfaeMiniScreen3Box2() },
            Box3 = { contentIgfaeMiniScreen3Box3(it) })
    }
}



