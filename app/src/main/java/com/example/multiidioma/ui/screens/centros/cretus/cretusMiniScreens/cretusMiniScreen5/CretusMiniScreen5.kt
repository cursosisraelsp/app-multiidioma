package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen5


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen5.contentCretusMiniScreen5.contentCretusMiniScreen5Box1
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen5.contentCretusMiniScreen5.contentCretusMiniScreen5Box2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen5.contentCretusMiniScreen5.contentCretusMiniScreen5Box3


@Composable
fun CretusMiniScreen5(
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
            Box1 = { contentCretusMiniScreen5Box1() },
            Box2 = { contentCretusMiniScreen5Box2(it) },
            Box3 = { contentCretusMiniScreen5Box3(it) })
    }
}



