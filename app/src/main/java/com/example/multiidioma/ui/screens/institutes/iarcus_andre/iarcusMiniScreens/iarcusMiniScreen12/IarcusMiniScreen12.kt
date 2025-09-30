package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen

import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box3


@Composable
fun IarcusMiniScreen12(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {

        }
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.70f, Box3 = 0.15f),
            data = data,
            Box1 = { contentIarcusMiniScreen12Box1() },
            Box2 = { contentIarcusMiniScreen12Box2(it) },
            Box3 = { contentIarcusMiniScreen12Box3() })
    }
}




