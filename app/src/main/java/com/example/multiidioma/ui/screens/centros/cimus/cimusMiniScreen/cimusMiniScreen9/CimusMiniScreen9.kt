package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9.contentCimusMiniScreen9.contentCimusMiniScreen9BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9.contentCimusMiniScreen9.contentCimusMiniScreen9CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9.contentCimusMiniScreen9.contentCimusMiniScreen9TitleText

@Composable
fun CimusMiniScreen9(
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
            VimeoWebViewComponent(identificador = "1124127236", width = "425px", height = "800px")
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCimusMiniScreen9CircleImage(it) },
                TitleText = { contentCimusMiniScreen9TitleText(it) },
                BodyText = { contentCimusMiniScreen9BodyText(it) }
            )
        }
    }
}
