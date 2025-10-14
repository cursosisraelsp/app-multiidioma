package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen19


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen19.contentCretusMiniScreen19.contentCretusMiniScreen19Box1
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen19.contentCretusMiniScreen19.contentCretusMiniScreen19Box2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen19.contentCretusMiniScreen19.contentCretusMiniScreen19Box3


@Composable
fun CretusMiniScreen19(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
       TemplateScreen(
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.80f, Box3 = 0.10f),
            data = data,
            Box1 = { contentCretusMiniScreen19Box1() },
            Box2 = { contentCretusMiniScreen19Box2(it) },
            Box3 = { contentCretusMiniScreen19Box3() })
    }
}

