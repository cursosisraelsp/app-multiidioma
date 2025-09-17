package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2.contentIhusMiniScreen2.contentIhusMiniScreen2Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2.contentIhusMiniScreen2.contentIhusMiniScreen2Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2.contentIhusMiniScreen2.contentIhusMiniScreen2Box3


@Composable
fun IhusMiniScreen2(
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
            Box1 = { contentIhusMiniScreen2Box1() },
            Box2 = { contentIhusMiniScreen2Box2(it) },
            Box3 = { contentIhusMiniScreen2Box3() }
        )
    }
}