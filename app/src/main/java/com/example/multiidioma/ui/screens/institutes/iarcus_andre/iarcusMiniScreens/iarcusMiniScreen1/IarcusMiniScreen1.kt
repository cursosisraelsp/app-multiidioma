package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen1.contentIarcusMiniScreen1.contentIarcusMiniScreen1Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen1.contentIarcusMiniScreen1.contentIarcusMiniScreen1Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen1.contentIarcusMiniScreen1.contentIarcusMiniScreen1Box3


@Composable
fun IarcusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            data = data,
            Box1 = { contentIarcusMiniScreen1Box1()},
            Box2 = { contentIarcusMiniScreen1Box2(it) },
            Box3 = { contentIarcusMiniScreen1Box3(it) })

    }
}
