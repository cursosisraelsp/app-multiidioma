package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen5

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
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen5.contentCiqusMiniScreen5.contentCiqusMiniScreen5BodyText
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen5.contentCiqusMiniScreen5.contentCiqusMiniScreen5CircleImage
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen5.contentCiqusMiniScreen5.contentCiqusMiniScreen5TitleText


@Composable
fun CiqusMiniScreen5(
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

            VimeoWebViewComponent(identificador = "1124127384",width="425px", height = "800px")
        }

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCiqusMiniScreen5CircleImage(it) },
                TitleText = { contentCiqusMiniScreen5TitleText(it) },
                BodyText = { contentCiqusMiniScreen5BodyText(it) }
            )
        }
    }
}