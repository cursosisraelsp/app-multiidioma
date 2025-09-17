package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6Box3


@Composable
fun IhusMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.33f, Box2 = 0.33f, Box3 = 0.33f),
            data = data,
            Box1 = { contentIhusMiniScreen6Box1(it) },
            Box2 = { contentIhusMiniScreen6Box2(it) },
            Box3 = { contentIhusMiniScreen6Box3() }
        )
    }
}