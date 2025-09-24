package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.Imatus.ImatusMiniScreens.ImatusMiniScreen1.contentImatusMiniScreen1.contentImatusMiniScreen1Box2

import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.contentImatusMiniScreen1.contentImatusMiniScreen1Box1


@Composable
fun ImatusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {

            TemplateScreen(
                data = data,
                Box1 = { contentImatusMiniScreen1Box1() },
                Box2 = { contentImatusMiniScreen1Box2(it) },
            )
        }
    }
}
