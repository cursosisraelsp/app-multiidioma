package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen9

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
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen9.contentIdisMiniScreen9.contentIdisMiniScreen9BodyText
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen9.contentIdisMiniScreen9.contentIdisMiniScreen9CircleImage
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen9.contentIdisMiniScreen9.contentIdisMiniScreen9TitleText


@Composable
fun IdisMiniScreen9(
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

            VimeoWebViewComponent(identificador = "1124127428",width="425px", height = "800px")
        }

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIdisMiniScreen9CircleImage(it) },
                TitleText = { contentIdisMiniScreen9TitleText(it) },
                BodyText = { contentIdisMiniScreen9BodyText(it) }
            )
        }
    }
}