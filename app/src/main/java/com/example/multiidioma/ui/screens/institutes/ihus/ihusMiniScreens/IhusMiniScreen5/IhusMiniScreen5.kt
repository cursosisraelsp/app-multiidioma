package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5.contentIhusMiniScreen5.contentIhusMiniScreen5Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5.contentIhusMiniScreen5.contentIhusMiniScreen5Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5.contentIhusMiniScreen5.contentIhusMiniScreen5Box3


@Composable
fun IhusMiniScreen5(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.8f, Box3 = 0.1f),
            data = data,
            Box1 = { contentIhusMiniScreen5Box1(it) },
            Box2 = { contentIhusMiniScreen5Box2(it) },
            Box3 = { contentIhusMiniScreen5Box3() }
        )
    }
}