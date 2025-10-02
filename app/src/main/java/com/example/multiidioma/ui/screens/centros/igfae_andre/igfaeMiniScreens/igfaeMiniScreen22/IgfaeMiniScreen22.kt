package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen22


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen22.contentIgfaeMiniScreen22.contentIgfaeMiniScreen22Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen22.contentIgfaeMiniScreen22.contentIgfaeMiniScreen22Box3


@Composable
fun IgfaeMiniScreen22(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.00f, Box2 = 0.60f, Box3 = 0.40f),
            data = data,
            Box2 = { contentIgfaeMiniScreen22Box2(it) },
            Box3 = { contentIgfaeMiniScreen22Box3()})
    }
}



