package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen10a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.Iarcus_andre.IarcusMiniScreens.IarcusMiniScreen10.contentIarcusMiniScreen10.contentIarcusMiniScreen10BodyText
import com.example.multiidioma.ui.screens.institutes.Iarcus_andre.IarcusMiniScreens.IarcusMiniScreen10.contentIarcusMiniScreen10.contentIarcusMiniScreen10CircleImage
import com.example.multiidioma.ui.screens.institutes.Iarcus_andre.IarcusMiniScreens.IarcusMiniScreen10.contentIarcusMiniScreen10.contentIarcusMiniScreen10TitleText


@Composable
fun IarcusMiniScreen10(
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
            CircleImage = { contentIarcusMiniScreen10CircleImage(it) },
            TitleText = { contentIarcusMiniScreen10TitleText(it) },
            BodyText = { contentIarcusMiniScreen10BodyText(it) }
        )
    }
}



