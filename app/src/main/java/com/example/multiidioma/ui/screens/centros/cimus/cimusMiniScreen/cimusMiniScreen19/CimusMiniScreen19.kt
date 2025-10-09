package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen19

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen19.contentCimusMiniScreen19.contentCimusMiniScreen19Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen19.contentCimusMiniScreen19.contentCimusMiniScreen19Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen19.contentCimusMiniScreen19.contentCimusMiniScreen19Box3

@Composable
fun CimusMiniScreen19(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.75f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCimusMiniScreen19Box1() },
            Box2 = { contentCimusMiniScreen19Box2(it) },
            Box3 = { contentCimusMiniScreen19Box3() }
        )
    }
}