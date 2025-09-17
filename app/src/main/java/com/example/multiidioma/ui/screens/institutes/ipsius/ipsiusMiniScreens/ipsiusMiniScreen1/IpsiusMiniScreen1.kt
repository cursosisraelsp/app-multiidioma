package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen1.contentIpsiusMiniScreen1.contentIpsiusMiniScreen1Box1
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen1.contentIpsiusMiniScreen1.contentIpsiusMiniScreen1Box2
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen1.contentIpsiusMiniScreen1.contentIpsiusMiniScreen1Box3


@Composable
fun IpsiusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            data = data,
            Box1 = { contentIpsiusMiniScreen1Box1()},
            Box2 = { contentIpsiusMiniScreen1Box2(it) },
            Box3 = { contentIpsiusMiniScreen1Box3(it) })

    }
}
