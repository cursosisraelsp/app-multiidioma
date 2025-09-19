package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen8a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen


@Composable
fun IgfaeMiniScreen8(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateCircleScreen(
            data = data,
            navController = navController,
            CircleImage = { contentIgfaeMiniScreen8CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen8TitleText(it) },
            BodyText = { contentIgfaeMiniScreen8BodyText(it) }
        )
    }
}



