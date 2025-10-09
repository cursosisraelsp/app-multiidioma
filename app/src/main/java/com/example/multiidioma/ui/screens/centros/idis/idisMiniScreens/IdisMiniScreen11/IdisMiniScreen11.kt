package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen11

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
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen11.contentIdisMiniScreen11.contentIdisMiniScreen11BodyText
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen11.contentIdisMiniScreen11.contentIdisMiniScreen11CircleImage
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen11.contentIdisMiniScreen11.contentIdisMiniScreen11TitleText


@Composable
fun IdisMiniScreen11(
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

            VimeoWebViewComponent(identificador = "1124127332",width="425px", height = "800px")
        }

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentIdisMiniScreen11CircleImage(it) },
                TitleText = { contentIdisMiniScreen11TitleText(it) },
                BodyText = { contentIdisMiniScreen11BodyText(it) }
            )
        }
    }
}