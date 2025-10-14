package com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen19


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen19.contentIpsiusMiniScreen19.contentIpsiusMiniScreen19Box1
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen19.contentIpsiusMiniScreen19.contentIpsiusMiniScreen19Box2
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen19.contentIpsiusMiniScreen19.contentIpsiusMiniScreen19Box3


@Composable
fun IpsiusMiniScreen19(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.35f, Box2 = 0.40f, Box3 = 0.25f),
            data = data,
            Box1 = { contentIpsiusMiniScreen19Box1(it) },
            Box2 = { contentIpsiusMiniScreen19Box2(it) },
            Box3 = { contentIpsiusMiniScreen19Box3() })
    }
}



