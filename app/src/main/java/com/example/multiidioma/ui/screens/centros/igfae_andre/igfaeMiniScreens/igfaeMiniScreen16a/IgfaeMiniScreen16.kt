package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen16a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen13.contentIgfaeMiniScreen13.contentIgfaeMiniScreen13BodyText
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen13.contentIgfaeMiniScreen13.contentIgfaeMiniScreen13CircleImage
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen13.contentIgfaeMiniScreen13.contentIgfaeMiniScreen13TitleText

@Composable
fun IgfaeMiniScreen16(
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
            CircleImage = { contentIgfaeMiniScreen13CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen13TitleText(it) },
            BodyText = { contentIgfaeMiniScreen13BodyText(it) }
        )
    }
}