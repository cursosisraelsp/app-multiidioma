package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11.contentCimusMiniScreen11.contentCimusMiniScreen11BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11.contentCimusMiniScreen11.contentCimusMiniScreen11CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11.contentCimusMiniScreen11.contentCimusMiniScreen11TitleText

@Composable
fun CimusMiniScreen11(
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
                CircleImage = { contentCimusMiniScreen11CircleImage(it) },
                TitleText = { contentCimusMiniScreen11TitleText(it) },
                BodyText = { contentCimusMiniScreen11BodyText(it) }
            )
        }
    }
}
