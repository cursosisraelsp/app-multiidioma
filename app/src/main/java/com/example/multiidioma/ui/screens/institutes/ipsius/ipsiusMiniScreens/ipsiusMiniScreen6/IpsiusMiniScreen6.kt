package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6.contentIpsiusMiniScreen6.contentIpsiusMiniScreen6Box1
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6.contentIpsiusMiniScreen6.contentIpsiusMiniScreen6Box2
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6.contentIpsiusMiniScreen6.contentIpsiusMiniScreen6Box3


@Composable
fun IpsiusMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {


        PlantillaScreen(
            data = data,
            Box1 = { contentIpsiusMiniScreen6Box1() },
            Box2 = { contentIpsiusMiniScreen6Box2(it) },
            Box3 = { contentIpsiusMiniScreen6Box3(it) })
    }
}



