package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen21


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen21.contentIgfaeMiniScreen21.contentIgfaeMiniScreen21Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen21.contentIgfaeMiniScreen21.contentIgfaeMiniScreen21Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen21.contentIgfaeMiniScreen21.contentIgfaeMiniScreen21Box3


@Composable
fun IgfaeMiniScreen21(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.4f, Box3 = 0.3f),
            Box1 = { contentIgfaeMiniScreen21Box1(it) },
            Box2 = { contentIgfaeMiniScreen21Box2(it) },
            Box3 = { contentIgfaeMiniScreen21Box3() })
    }
}



