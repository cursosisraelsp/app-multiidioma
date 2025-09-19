package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen15


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen15.contentIpsiusMiniScreen15.contentIpsiusMiniScreen15Box3


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


        PlantillaScreen(
            data = data,
            Box1 = { contentIpsiusMiniScreen15Box1() },
            Box2 = { contentIpsiusMiniScreen15Box2(it) },
            Box3 = { contentIpsiusMiniScreen15Box3(it)
            })
    }
}



