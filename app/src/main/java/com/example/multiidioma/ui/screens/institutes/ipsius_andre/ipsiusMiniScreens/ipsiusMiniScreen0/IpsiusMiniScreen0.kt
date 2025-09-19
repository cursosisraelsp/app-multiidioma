package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box3


@Composable
fun IpsiusMiniScreen0(
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
            Box2 = { contentIpsiusMiniScreen0Box2(it) },
            Box3 = { contentIpsiusMiniScreen0Box3()
            }
        )
    }
}



