package com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9.contentIgfaeMiniScreen9.contentIgfaeMiniScreen9BodyText
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9.contentIgfaeMiniScreen9.contentIgfaeMiniScreen9CircleImage
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9.contentIgfaeMiniScreen9.contentIgfaeMiniScreen9TitleText


@Composable
fun IgfaeMiniScreen9(
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
            CircleImage = { contentIgfaeMiniScreen9CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen9TitleText(it) },
            BodyText = { contentIgfaeMiniScreen9BodyText(it) }
        )
    }
}
