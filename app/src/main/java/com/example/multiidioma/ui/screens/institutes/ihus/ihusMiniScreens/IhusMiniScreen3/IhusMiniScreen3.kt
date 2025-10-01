package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.repository.BOX

import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.contenIhusMiniScreen3.contentIhusMiniScreen3Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.contenIhusMiniScreen3.contentIhusMiniScreen3Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.contenIhusMiniScreen3.contentIhusMiniScreen3Box3


@Composable
fun IhusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.6f, Box3 = 0.3f),
            data = data,
            Box1 = { contentIhusMiniScreen3Box1() },
            Box2 = { contentIhusMiniScreen3Box2(it) },
            Box3 = { contentIhusMiniScreen3Box3() }
        )
    }
}