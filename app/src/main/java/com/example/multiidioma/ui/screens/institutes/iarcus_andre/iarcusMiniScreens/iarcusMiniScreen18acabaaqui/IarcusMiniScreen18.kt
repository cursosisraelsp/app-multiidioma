package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen18acabaaqui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen18acabaaqui.contentIpsiusMiniScreen18.contentIarcusMiniScreen18Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen18acabaaqui.contentIpsiusMiniScreen18.contentIarcusMiniScreen18Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen18acabaaqui.contentIpsiusMiniScreen18.contentIarcusMiniScreen18Box3


@Composable
fun IarcusMiniScreen18(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.35f, Box2 = 0.40f, Box3 = 0.25f),
            data = data,
            Box1 = { contentIarcusMiniScreen18Box1(it) },
            Box2 = { contentIarcusMiniScreen18Box2(it) },
            Box3 = { contentIarcusMiniScreen18Box3() })
    }
}



