package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen16BodyText
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen16CircleImage
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen.contentInciforMiniScreen16TitleText

@Composable
fun InciforMiniScreen16(
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
            CircleImage = { contentInciforMiniScreen16CircleImage(it) },
            TitleText = { contentInciforMiniScreen16TitleText(it) },
            BodyText = { contentInciforMiniScreen16BodyText(it) }
        )
    }
}


