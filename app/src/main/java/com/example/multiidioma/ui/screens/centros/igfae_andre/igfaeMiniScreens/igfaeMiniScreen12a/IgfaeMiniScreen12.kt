package com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12.contentIgfaeMiniScreen12.contentIgfaeMiniScreen12BodyText
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12.contentIgfaeMiniScreen12.contentIgfaeMiniScreen12CircleImage
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12.contentIgfaeMiniScreen12.contentIgfaeMiniScreen12TitleText


@Composable
fun IgfaeMiniScreen12(
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
            CircleImage = { contentIgfaeMiniScreen12CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen12TitleText(it) },
            BodyText = { contentIgfaeMiniScreen12BodyText(it) }
        )
    }
}



