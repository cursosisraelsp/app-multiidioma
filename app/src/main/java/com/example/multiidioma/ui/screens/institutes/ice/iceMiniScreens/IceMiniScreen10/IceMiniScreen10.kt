package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen10.contentIceMiniScreen10.contentIceMiniScreen10BodyText
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen10.contentIceMiniScreen10.contentIceMiniScreen10CircleImage
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen10.contentIceMiniScreen10.contentIceMiniScreen10TitleText

@Composable
fun IceMiniScreen10(
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
            VimeoWebViewComponent(identificador = "1124127249", width = "425px", height = "800px")
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIceMiniScreen10CircleImage(it) },
                TitleText = { contentIceMiniScreen10TitleText(it) },
                BodyText = { contentIceMiniScreen10BodyText(it) }
            )
        }
    }
}

