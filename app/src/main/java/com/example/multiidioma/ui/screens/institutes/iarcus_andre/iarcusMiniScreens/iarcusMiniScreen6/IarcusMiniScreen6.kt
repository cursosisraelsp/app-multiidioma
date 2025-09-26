package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen6


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen6.contentIarcusMiniScreen6.contentIarcusMiniScreen6Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen6.contentIarcusMiniScreen6.contentIarcusMiniScreen6Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen6.contentIarcusMiniScreen6.contentIarcusMiniScreen6Box3


@Composable
fun IarcusMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {

        TemplateScreen(

            data = data,
            Box1 = { contentIarcusMiniScreen6Box1() },
            Box2 = { contentIarcusMiniScreen6Box2(it)},
            Box3 = { contentIarcusMiniScreen6Box3(it)}
        )
    }
}






