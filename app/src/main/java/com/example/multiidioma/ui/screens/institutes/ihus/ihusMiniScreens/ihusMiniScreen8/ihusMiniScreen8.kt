package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8BodyText
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8CircleImage
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.contentIhusMiniScreen8.contentIhusMiniScreen8TitleText


@Composable
fun IhusMiniScreen8(
    // pantalla
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateCircleScreen(
            navController = navController,
            data = data,
            CircleImage = { contentIhusMiniScreen8CircleImage(it) },
            TitleText = { contentIhusMiniScreen8TitleText(it) },
            BodyText = { contentIhusMiniScreen8BodyText(it) }
        )
    }
}