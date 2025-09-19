package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen18

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen18BodyText
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen18CircleImage
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen18TitleText


@Composable
fun InciforMiniScreen18(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateCircleScreen(
            data = data,
            navController = navController,
            CircleImage = {  contentInciforMiniScreen18CircleImage(it)},
            TitleText = { contentInciforMiniScreen18TitleText(it)},
            BodyText = {contentInciforMiniScreen18BodyText(it) }
        )
    }
}

