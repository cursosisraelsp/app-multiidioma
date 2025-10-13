package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen10

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
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen10.contentIdisMiniScreen10.contentIdisMiniScreen10BodyText
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen10.contentIdisMiniScreen10.contentIdisMiniScreen10CircleImage
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen10.contentIdisMiniScreen10.contentIdisMiniScreen10TitleText


@Composable
fun IdisMiniScreen10(
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

            VimeoWebViewComponent(identificador = "1124127312",width="425px", height = "800px")
        }

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIdisMiniScreen10CircleImage(it) },
                TitleText = { contentIdisMiniScreen10TitleText(it) },
                BodyText = { contentIdisMiniScreen10BodyText(it) }
            )
        }
    }
}