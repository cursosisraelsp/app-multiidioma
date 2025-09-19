package com.example.multiidioma.ui.screens.centros.cretus_andre.CretusMiniScreens.cretusMiniScreen12a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen12.contentCretusMiniScreen12.contentCretusMiniScreen12BodyText
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen12.contentCretusMiniScreen12.contentCretusMiniScreen12CircleImage
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen12.contentCretusMiniScreen12.contentCretusMiniScreen12TitleText


@Composable
fun CretusMiniScreen12(
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
            CircleImage = { contentCretusMiniScreen12CircleImage(it) },
            TitleText = { contentCretusMiniScreen12TitleText(it) },
            BodyText = { contentCretusMiniScreen12BodyText(it) }
        )
    }
}



