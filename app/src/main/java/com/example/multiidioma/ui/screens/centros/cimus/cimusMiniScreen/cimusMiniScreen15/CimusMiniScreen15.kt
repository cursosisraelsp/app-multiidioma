package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen15

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen15.contentCimusMiniScreen15.contentCimusMiniScreen15BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen15.contentCimusMiniScreen15.contentCimusMiniScreen15CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen15.contentCimusMiniScreen15.contentCimusMiniScreen15TitleText

@Composable
fun CimusMiniScreen15(
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
            VimeoWebViewComponent(identificador = "1524157236", width = "425px", height = "800px")
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCimusMiniScreen15CircleImage(it) },
                TitleText = { contentCimusMiniScreen15TitleText(it) },
                BodyText = { contentCimusMiniScreen15BodyText(it) }
            )
        }
    }
}
