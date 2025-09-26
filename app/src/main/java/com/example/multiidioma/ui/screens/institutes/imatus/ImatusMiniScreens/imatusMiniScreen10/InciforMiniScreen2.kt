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
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen2Box1
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen2Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.contentImatusMiniScreen10.contentImatusMiniScreen2Box3

@Composable
fun ImatusMiniScreen10(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.60f, Box3 = 0.3f),
            data = data,
            Box1 = { contentImatusMiniScreen2Box1() },
            Box2 = { contentImatusMiniScreen2Box2(it) },
            Box3 = { contentImatusMiniScreen2Box3() }
        )
    }
}


