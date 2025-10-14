package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen8


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen8.contentCretusMiniScreen8.contentCretusMiniScreen8BodyText
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen8.contentCretusMiniScreen8.contentCretusMiniScreen8CircleImage
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen8.contentCretusMiniScreen8.contentCretusMiniScreen8TitleText


@Composable
fun CretusMiniScreen8(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateCircleScreen(
            data = data,
            navController = navController,
            CircleImage = { contentCretusMiniScreen8CircleImage(it) },
            TitleText = { contentCretusMiniScreen8TitleText(it) },
            BodyText = { contentCretusMiniScreen8BodyText(it) }
        )
    }
}



