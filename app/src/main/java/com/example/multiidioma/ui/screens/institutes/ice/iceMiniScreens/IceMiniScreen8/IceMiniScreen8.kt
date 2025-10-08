package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8

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
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8.contentIceMiniScreen8.contentIceMiniScreen8BodyText
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8.contentIceMiniScreen8.contentIceMiniScreen8CircleImage
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8.contentIceMiniScreen8.contentIceMiniScreen8TitleText

@Composable
fun IceMiniScreen8(
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
            VimeoWebViewComponent(identificador = "1124127265", width = "425px", height = "800px")

        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIceMiniScreen8CircleImage(it) },
                TitleText = { contentIceMiniScreen8TitleText(it) },
                BodyText = { contentIceMiniScreen8BodyText(it) }
            )
        }
    }
}

