package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.contentImatusMiniScreen2.contentImatusMiniScreen2Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.contentImatusMiniScreen2.contentImatusMiniScreen2Box3


@Composable
fun ImatusMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0f, Box2 = 0.5f, Box3 = 0.5f),
            data = data,
            Box2 = { contentImatusMiniScreen2Box2(it) },
            Box3 = { contentImatusMiniScreen2Box3(it) }
        )
    }
}