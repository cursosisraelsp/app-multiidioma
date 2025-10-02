package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen5


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen5.contentIarcusMiniScreen5.contentIarcusMiniScreen5Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen5.contentIarcusMiniScreen5.contentIarcusMiniScreen5Box3


@Composable
fun IarcusMiniScreen5(
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
            BoxWeight = BOX(Box1 = 0.0f, Box2 = 0.8f, Box3 = 0.20f),
            Box2 = { contentIarcusMiniScreen5Box2(it) },
            Box3 = { contentIarcusMiniScreen5Box3() })
    }
}



