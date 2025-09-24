package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen12

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen

import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.contentImatusMiniScreen3.contentImatusMiniScreen3Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.contentImatusMiniScreen3.contentImatusMiniScreen3Box3

@Composable
fun ImatusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.45f, Box3 = 0.4f),
            data = data,
            Box2 = { contentImatusMiniScreen3Box2(it) },
            Box3 = { contentImatusMiniScreen3Box3() }
        )
    }
}