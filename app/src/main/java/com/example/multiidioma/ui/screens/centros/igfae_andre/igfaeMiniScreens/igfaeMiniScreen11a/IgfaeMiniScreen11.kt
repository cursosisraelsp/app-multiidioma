package com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen11a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11.contentIgfaeMiniScreen11BodyText
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11.contentIgfaeMiniScreen11CircleImage
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11.contentIgfaeMiniScreen11TitleText

@Composable
fun IgfaeMiniScreen11(
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
            CircleImage = { contentIgfaeMiniScreen11CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen11TitleText(it) },
            BodyText = { contentIgfaeMiniScreen11BodyText(it) }
        )
    }
}



