package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen11a.contentIarcusMiniScreen11.contentIarcusMiniScreen11BodyText
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen11a.contentIarcusMiniScreen11.contentIarcusMiniScreen11CircleImage
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen11a.contentIarcusMiniScreen11.contentIarcusMiniScreen11TitleText
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12BodyText
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12Box3
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12CircleImage
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen12a.contentIArcusMiniScreen12.contentIarcusMiniScreen12TitleText


@Composable
fun IarcusMiniScreen12(
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
            CircleImage = { contentIarcusMiniScreen12CircleImage(it) },
            TitleText = { contentIarcusMiniScreen12TitleText(it) },
            BodyText = { contentIarcusMiniScreen12BodyText(it) }
        )
    }
}



