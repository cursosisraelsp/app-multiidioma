package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen17


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData


import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen17.contentIgfaeMiniScreen17.contentIgfaeMiniScreen17Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen17.contentIgfaeMiniScreen17.contentIgfaeMiniScreen17Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen17.contentIgfaeMiniScreen17.contentIgfaeMiniScreen17Box3


@Composable
fun IgfaeMiniScreen17(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.85f, Box3 = 0.10f),
            data = data,
            Box1 = { contentIgfaeMiniScreen17Box1() },
            Box2 = { contentIgfaeMiniScreen17Box2(it) },
            Box3 = { contentIgfaeMiniScreen17Box3()})
    }
}



