package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen14.contentIpsiusMiniScreen14.contentIpsiusMiniScreen14Box3


@Composable
fun IarcusMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            data = data,
            Box1 = { contentIarcusMiniScreen14Box1() },
            Box2 = { contentIarcusMiniScreen14Box2(it) },
            Box3 = { contentIarcusMiniScreen14Box3(it) })
    }
}



