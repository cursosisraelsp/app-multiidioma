package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10

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
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10.contentCitiusMiniScreen10.contentCitiusMiniScreen10BodyText
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10.contentCitiusMiniScreen10.contentCitiusMiniScreen10CircleImage
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10.contentCitiusMiniScreen10.contentCitiusMiniScreen10TitleText

@Composable
fun CitiusMiniScreen10(
data : MiniScreenData,
navController: NavController,
modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF41810B5))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "paWE-GvDO1c",
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(10f / 16f)
            )
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCitiusMiniScreen10CircleImage(it) },
                TitleText = { contentCitiusMiniScreen10TitleText(it) },
                BodyText = { contentCitiusMiniScreen10BodyText(it) }
            )
        }
    }
}
