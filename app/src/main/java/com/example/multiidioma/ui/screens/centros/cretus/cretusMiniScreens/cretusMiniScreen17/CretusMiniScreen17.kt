package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen17


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen

import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen17.contentCretusMiniScreen17.contentCretusMiniScreen17Box2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen17.contentCretusMiniScreen17.contentCretusMiniScreen17Box3


@Composable
fun CretusMiniScreen17(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.80f, Box3 = 0.10f),
            data = data,

            Box2 = { contentCretusMiniScreen17Box2(it) },
            Box3 = { contentCretusMiniScreen17Box3() })
    }
}



