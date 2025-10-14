package com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen21i


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen21i.contentIpsiusMiniScreen21.contentIpsiusMiniScreen21Box1
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen21i.contentIpsiusMiniScreen21.contentIpsiusMiniScreen21Box2
import com.example.multiidioma.ui.screens.institutes.ipsius.ipsiusMiniScreens.ipsiusMiniScreen21i.contentIpsiusMiniScreen21.contentIpsiusMiniScreen21Box3


@Composable
fun IpsiusMiniScreen21(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateScreen(
            data = data,
            Box1 = { contentIpsiusMiniScreen21Box1()},
            Box2 = { contentIpsiusMiniScreen21Box2(it) },
            Box3 = { contentIpsiusMiniScreen21Box3(it) })

    }
}



