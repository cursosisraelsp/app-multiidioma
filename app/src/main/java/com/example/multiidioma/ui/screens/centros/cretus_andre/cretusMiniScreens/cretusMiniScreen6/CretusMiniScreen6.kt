package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen6


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen6.contentCretusMiniScreen6.contentCretusMiniScreen6Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen6.contentCretusMiniScreen6.contentCretusMiniScreen6Box2
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen6.contentCretusMiniScreen6.contentCretusMiniScreen6Box3


@Composable
fun CretusMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {


        TemplateScreen(
            data = data,
            Box1 = { contentCretusMiniScreen6Box1() },
            Box2 = { contentCretusMiniScreen6Box2(it) },
            Box3 = { contentCretusMiniScreen6Box3(it) })
    }
}



