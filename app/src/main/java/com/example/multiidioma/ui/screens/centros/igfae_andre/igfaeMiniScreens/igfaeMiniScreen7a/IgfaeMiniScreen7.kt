package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen7a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen7a.contentIgfaeMiniScreen7.contentIgfaeMiniScreen7BodyText
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen7a.contentIgfaeMiniScreen7.contentIgfaeMiniScreen7CircleImage
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen7a.contentIgfaeMiniScreen7.contentIgfaeMiniScreen7TitleText


@Composable
fun IgfaeMiniScreen7(
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
            CircleImage = { contentIgfaeMiniScreen7CircleImage(it) },
            TitleText = { contentIgfaeMiniScreen7TitleText(it) },
            BodyText = { contentIgfaeMiniScreen7BodyText(it) }
        )
    }
}




