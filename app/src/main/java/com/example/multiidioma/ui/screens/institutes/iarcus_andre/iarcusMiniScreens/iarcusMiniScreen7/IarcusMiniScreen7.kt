package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7.contentIarcusMiniScreen7.contentIarcusMiniScreen7Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7.contentIarcusMiniScreen7.contentIarcusMiniScreen7Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7.contentIarcusMiniScreen7.contentIarcusMiniScreen7Box3


@Composable
fun IarcusMiniScreen7(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateCircleScreen(
            data = data,
            navController = navController,
            CircleImage = { contentIarcusMiniScreen7Box1(it) },
            TitleText = { contentIarcusMiniScreen7Box2(it) },
            BodyText = { contentIarcusMiniScreen7Box3(it) }
        )
    }
}




