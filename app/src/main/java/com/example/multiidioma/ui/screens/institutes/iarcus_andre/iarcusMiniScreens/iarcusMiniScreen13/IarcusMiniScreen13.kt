package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen13


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen13.contentIarcusMiniScreen13.contentIarcusMiniScreen13Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen13.contentIarcusMiniScreen13.contentIarcusMiniScreen13Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen13.contentIarcusMiniScreen13.contentIarcusMiniScreen13Box3

@Composable
fun IarcusMiniScreen13(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.70f, Box3 = 0.10f),
            Box1 = { contentIarcusMiniScreen13Box1() },
            Box2 = { contentIarcusMiniScreen13Box2(it) },
            Box3 = { contentIarcusMiniScreen13Box3() }
        )
    }
}



