package com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box1
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box2
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box3


@Composable
fun IpsiusMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.80f, Box3 = 0.10f),
            data = data,
            Box1 = { contentIpsiusMiniScreen14Box1() },
            Box2 = { contentIpsiusMiniScreen14Box2(it) },
            Box3 = { contentIpsiusMiniScreen14Box3() })
    }
}



