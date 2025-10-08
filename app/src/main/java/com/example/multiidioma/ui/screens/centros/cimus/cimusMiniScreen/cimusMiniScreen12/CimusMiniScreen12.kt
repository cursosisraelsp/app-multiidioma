package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12.contentCimusMiniScreen12.contentCimusMiniScreen12BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12.contentCimusMiniScreen12.contentCimusMiniScreen12CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12.contentCimusMiniScreen12.contentCimusMiniScreen12TitleText

@Composable
fun CimusMiniScreen12(
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
            VimeoWebViewComponent(identificador = "1224127236", width = "425px", height = "800px")
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCimusMiniScreen12CircleImage(it) },
                TitleText = { contentCimusMiniScreen12TitleText(it) },
                BodyText = { contentCimusMiniScreen12BodyText(it) }
            )
        }
    }
}
