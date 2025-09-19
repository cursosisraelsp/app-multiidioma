package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16.contentIpsiusMiniScreen16.contentIpsiusMiniScreen16Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16.contentIpsiusMiniScreen16.contentIpsiusMiniScreen16Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen16.contentIpsiusMiniScreen16.contentIpsiusMiniScreen16Box3

@Composable
fun IpsiusMiniScreen16(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.20f, Box2 = 0.50f, Box3 = 0.30f),
            data = data,
            Box1 = { contentIpsiusMiniScreen16Box1() },
            Box2 = { contentIpsiusMiniScreen16Box2(it) },
            Box3 = { contentIpsiusMiniScreen16Box3(it)})
    }
}



