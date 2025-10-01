package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.contentIhusMiniScreen4.contentIhusMiniScreen4Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.contentIhusMiniScreen4.contentIhusMiniScreen4Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.contentIhusMiniScreen4.contentIhusMiniScreen4Box3

@Composable
fun IhusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.7f, Box3 = 0.1f),
            data = data,
            Box1 = { contentIhusMiniScreen4Box1(it) },
            Box2 = { contentIhusMiniScreen4Box2(it) },
            Box3 = { contentIhusMiniScreen4Box3() },
        )
    }
}