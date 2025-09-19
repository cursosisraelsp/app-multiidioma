package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen5


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen5.contentIpsiusMiniScreen5.contentIpsiusMiniScreen5Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen5.contentIpsiusMiniScreen5.contentIpsiusMiniScreen5Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen5.contentIpsiusMiniScreen5.contentIpsiusMiniScreen5Box3


@Composable
fun IpsiusMiniScreen5(
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
            Box1 = { contentIpsiusMiniScreen5Box1() },
            Box2 = { contentIpsiusMiniScreen5Box2(it) },
            Box3 = { contentIpsiusMiniScreen5Box3(it) })
    }
}



