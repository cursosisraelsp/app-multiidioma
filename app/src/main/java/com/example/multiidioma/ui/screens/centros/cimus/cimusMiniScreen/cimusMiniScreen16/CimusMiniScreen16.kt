package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen16

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen16.contentCimusMiniScreen16.contentCimusMiniScreen16BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen16.contentCimusMiniScreen16.contentCimusMiniScreen16CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen16.contentCimusMiniScreen16.contentCimusMiniScreen16TitleText

@Composable
fun CimusMiniScreen16(
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
            VimeoWebViewComponent(identificador = "1624167236", width = "425px", height = "800px")
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentCimusMiniScreen16CircleImage(it) },
                TitleText = { contentCimusMiniScreen16TitleText(it) },
                BodyText = { contentCimusMiniScreen16BodyText(it) }
            )
        }
    }
}
