package com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen10a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10BodyText
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10CircleImage
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10TitleText


@Composable
fun IgfaeMiniScreen10(
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
            CircleImage = { contentIgfaeMiniScreen10CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen10TitleText(it) },
            BodyText = { contentIgfaeMiniScreen10BodyText(it) }
        )
    }
}



