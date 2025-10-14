package com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen9a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.VideoScreen

import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen9a.contentIarcusMiniScreen9.contentIarcusMiniScreen9BodyText
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen9a.contentIarcusMiniScreen9.contentIarcusMiniScreen9CircleImage
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen9a.contentIarcusMiniScreen9.contentIarcusMiniScreen9TitleText


@Composable
fun IarcusMiniScreen9(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "", // Coloca aquí tu ID de video
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f) // Ajusta la relación de aspecto del video
            )
            TemplateCircleScreen(
                data = data,
                navController = navController,
                CircleImage = { contentIarcusMiniScreen9CircleImage(it) },
                TitleText = { contentIarcusMiniScreen9TitleText(it) },
                BodyText = { contentIarcusMiniScreen9BodyText(it) }
            )
        }
    }
}