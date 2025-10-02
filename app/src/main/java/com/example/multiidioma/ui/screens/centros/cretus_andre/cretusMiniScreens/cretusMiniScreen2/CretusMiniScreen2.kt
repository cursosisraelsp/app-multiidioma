package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen2.contentCretusMiniScreen2.contentCretusMiniScreen2Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen2.contentCretusMiniScreen2.contentCretusMiniScreen2Box2
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen2.contentCretusMiniScreen2.contentCretusMiniScreen2Box3


@Composable
fun CretusMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {


    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.7f, Box3 = 0.15f),
            Box1 = { contentCretusMiniScreen2Box1() },
            Box2 = { contentCretusMiniScreen2Box2(it) },
            Box3 = { contentCretusMiniScreen2Box3() })
    }
}