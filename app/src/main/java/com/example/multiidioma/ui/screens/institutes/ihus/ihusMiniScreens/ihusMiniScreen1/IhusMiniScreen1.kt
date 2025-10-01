package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.contentIhusMiniScreen1.contentIhusMiniScreen1Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.contentIhusMiniScreen1.contentIhusMiniScreen1Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.contentIhusMiniScreen1.contentIhusMiniScreen1Box3


@Composable
fun IhusMiniScreen1(
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
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.65f, Box3 = 0.15f),
            Box1 = { contentIhusMiniScreen1Box1() },
            Box2 = { contentIhusMiniScreen1Box2(it) },
            Box3 = { contentIhusMiniScreen1Box3() }
        )
    }
}