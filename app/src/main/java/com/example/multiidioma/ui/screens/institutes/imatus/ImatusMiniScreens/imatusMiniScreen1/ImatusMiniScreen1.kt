package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.contentImatusMiniScreen1.contentImatusMiniScreen1Box1
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.contentImatusMiniScreen1.contentImatusMiniScreen1Box2


@Composable
fun ImatusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {

            TemplateScreen(
                BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.9f, Box3 = 0f),
                data = data,
                Box1 = { contentImatusMiniScreen1Box1() },
                Box2 = { contentImatusMiniScreen1Box2(it) },
            )
        }
    }
}
