package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen3


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen3.contentCretusMiniScreen3.ContentCretusMiniScreen3Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen3.contentCretusMiniScreen3.ContentCretusMiniScreen3Box2


@Composable
fun CretusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()

            .background(Color(0xFF66AAD1))
    ) {


        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.70f, Box3 = 0.15f),
            data = data,
            Box1 = { ContentCretusMiniScreen3Box1() },
            Box2 = { ContentCretusMiniScreen3Box2(it) })
    }
}



