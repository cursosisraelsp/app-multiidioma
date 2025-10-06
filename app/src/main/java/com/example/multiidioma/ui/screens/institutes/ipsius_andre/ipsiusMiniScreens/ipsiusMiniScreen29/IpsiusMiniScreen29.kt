package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen29


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen29.contentIpsiusMiniScreen29.contentIpsiusMiniScreen29Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen29.contentIpsiusMiniScreen29.contentIpsiusMiniScreen29Box3


@Composable
fun IpsiusMiniScreen29(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0f, Box2 = 0.70f, Box3 = 0.30f),
            Box2 = { contentIpsiusMiniScreen29Box2(it) },
            Box3 = { contentIpsiusMiniScreen29Box3() })

    }
}


