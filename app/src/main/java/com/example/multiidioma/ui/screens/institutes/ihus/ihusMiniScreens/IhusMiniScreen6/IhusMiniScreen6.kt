package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6

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
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6BodyText
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6CircleImage
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.contentIhusMiniScreen6.contentIhusMiniScreen6TitleText


@Composable
fun IhusMiniScreen6(
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
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {

            VideoScreen(
                videoId = "92UgRKX8ooM", // tu ID de video
                modifier = Modifier.fillMaxSize().aspectRatio(9f / 16f))
        }

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIhusMiniScreen6CircleImage(it) },
                TitleText = { contentIhusMiniScreen6TitleText(it) },
                BodyText = { contentIhusMiniScreen6BodyText(it) }
            )
        }
    }
}