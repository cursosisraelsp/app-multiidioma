package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen20i


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen20i.contentIpsiusMiniScreen20.contentIpsiusMiniScreen20Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen20i.contentIpsiusMiniScreen20.contentIpsiusMiniScreen20Box2

import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen20i.contentIpsiusMiniScreen20.contentIpsiusMiniScreen20Box3


@Composable
fun IpsiusMiniScreen20(
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
            Box1 = { contentIpsiusMiniScreen20Box1()},
            Box2 = { contentIpsiusMiniScreen20Box2(it) },
            Box3 = { contentIpsiusMiniScreen20Box3(it) })

    }
}



