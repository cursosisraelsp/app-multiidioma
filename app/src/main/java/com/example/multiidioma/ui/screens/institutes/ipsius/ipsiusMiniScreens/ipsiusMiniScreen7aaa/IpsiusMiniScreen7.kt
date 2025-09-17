package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen7aaa


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen7aaa.contentIpsiusMiniScreen7.contentIpsiusMiniScreen7BodyText
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen7aaa.contentIpsiusMiniScreen7.contentIpsiusMiniScreen7CircleImage
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen7aaa.contentIpsiusMiniScreen7.contentIpsiusMiniScreen7TitleText


@Composable
fun IpsiusMiniScreen7(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateCircleScreen(
            data = data,
            navController = navController,
            CircleImage = { contentIpsiusMiniScreen7CircleImage(it) },
            TitleText = { contentIpsiusMiniScreen7TitleText(it) },
            BodyText = { contentIpsiusMiniScreen7BodyText(it) }
        )
    }
}


