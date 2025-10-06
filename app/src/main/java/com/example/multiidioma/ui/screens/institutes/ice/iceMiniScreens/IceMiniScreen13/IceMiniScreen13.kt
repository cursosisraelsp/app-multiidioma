package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13

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
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13.contentIceMiniScreen13.contentIceMiniScreen13BodyText
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13.contentIceMiniScreen13.contentIceMiniScreen13CircleImage
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13.contentIceMiniScreen13.contentIceMiniScreen13TitleText

@Composable
fun IceMiniScreen13(
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
                videoId = "paWE-GvDO1c",
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIceMiniScreen13CircleImage(it) },
                TitleText = { contentIceMiniScreen13TitleText(it) },
                BodyText = { contentIceMiniScreen13BodyText(it) }
            )
        }
    }
}

