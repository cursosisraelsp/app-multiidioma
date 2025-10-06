package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen7

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
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen7.contentIceMiniScreen7.contentIceMiniScreen7BodyText
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen7.contentIceMiniScreen7.contentIceMiniScreen7CircleImage
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen7.contentIceMiniScreen7.contentIceMiniScreen7TitleText

@Composable
fun IceMiniScreen7(
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
                CircleImage = { contentIceMiniScreen7CircleImage(it) },
                TitleText = { contentIceMiniScreen7TitleText(it) },
                BodyText = { contentIceMiniScreen7BodyText(it) }
            )
        }
    }
}

