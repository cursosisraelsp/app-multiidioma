package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.IgfaeMiniScreen11a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11.contentCretusMiniScreen11.contentIgfaeMiniScreen11TitleText
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11.contentIgfaeMiniScreen11BodyText
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen11a.contentCretusMiniScreen11.contentIgfaeMiniScreen11CircleImage

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
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "", // Coloca aquí tu ID de video
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f) // Ajusta la relación de aspecto del video
            )
            TemplateCircleScreen(
                data = data,
                navController = navController,
                CircleImage = { contentIgfaeMiniScreen11CircleImage(it) },
                TitleText = { contentIgfaeMiniScreen11TitleText(it) },
                BodyText = { contentIgfaeMiniScreen11BodyText(it) }
            )
        }
    }
}



