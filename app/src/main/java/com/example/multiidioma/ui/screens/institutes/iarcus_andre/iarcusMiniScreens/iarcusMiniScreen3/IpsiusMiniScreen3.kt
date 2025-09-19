package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen3


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen3.contentIpsiusMiniScreen3.ContentIpsiusMiniScreen3Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen3.contentIpsiusMiniScreen3.ContentIpsiusMiniScreen3Box2


@Composable
fun IpsiusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()

            .background(Color(0xFFBCE0F0))
    ) {


        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.54f, Box3 = 0.01f),
            data = data,
            Box1 = { ContentIpsiusMiniScreen3Box1(it) },

            Box2 = { ContentIpsiusMiniScreen3Box2() })
    }
}



