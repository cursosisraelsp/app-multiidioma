package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8Box3

@Composable
fun IhusMiniScreen8(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.25f, Box3 = 0.6f),
            data = data,
            Box1 = { contentIhusMiniScreen8Box1(it) },
            Box2 = { contentIhusMiniScreen8Box2(it) },
            Box3 = { contentIhusMiniScreen8Box3() }
        )
    }
}