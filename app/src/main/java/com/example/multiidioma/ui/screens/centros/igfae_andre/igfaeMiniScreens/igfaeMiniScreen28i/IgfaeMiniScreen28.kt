package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen28i


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen28i.contentIgfaeMiniScreen27.contentIgfaeMiniScreen28Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen28i.contentIgfaeMiniScreen27.contentIgfaeMiniScreen28Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen28i.contentIgfaeMiniScreen27.contentIgfaeMiniScreen28Box3


@Composable
fun IgfaeMiniScreen28(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.4f, Box3 = 0.3f),
            Box1 = { contentIgfaeMiniScreen28Box1(it) },
            Box2 = { contentIgfaeMiniScreen28Box2(it) },
            Box3 = { contentIgfaeMiniScreen28Box3() })
    }
}



