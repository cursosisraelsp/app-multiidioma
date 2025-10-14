package com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen15


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box1
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box2
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box3


@Composable
fun IpsiusMiniScreen15(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.70f, Box3 = 0.15f),
            data = data,
            Box1 = { contentIpsiusMiniScreen15Box1() },
            Box2 = { contentIpsiusMiniScreen15Box2(it) },
            Box3 = { contentIpsiusMiniScreen15Box3() })
    }
}



