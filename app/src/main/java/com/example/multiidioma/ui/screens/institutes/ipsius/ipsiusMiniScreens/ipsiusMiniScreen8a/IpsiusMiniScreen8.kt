package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a


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
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a.contentIpsiusMiniScreen8.contentIpsiusMiniScreen8BodyText
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a.contentIpsiusMiniScreen8.contentIpsiusMiniScreen8CircleImage
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a.contentIpsiusMiniScreen8.contentIpsiusMiniScreen8TitleText


@Composable
fun IpsiusMiniScreen8(
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
            CircleImage = { contentIpsiusMiniScreen8CircleImage(it) },
            TitleText = { contentIpsiusMiniScreen8TitleText(it) },
            BodyText = { contentIpsiusMiniScreen8BodyText(it) }
        )
    }
}}



