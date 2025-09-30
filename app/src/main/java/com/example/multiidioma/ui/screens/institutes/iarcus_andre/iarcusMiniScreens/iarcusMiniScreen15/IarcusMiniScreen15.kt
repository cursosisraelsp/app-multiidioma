package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen15


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen15.contentIarcusMiniScreen15.contentIarcusMiniScreen15Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen15.contentIarcusMiniScreen15.contentIarcusMiniScreen15Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen15.contentIarcusMiniScreen15.contentIarcusMiniScreen15Box3


@Composable
fun IarcusMiniScreen15(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {


       TemplateScreen(
            data = data,
            Box1 = { contentIarcusMiniScreen15Box1() },
            Box2 = { contentIarcusMiniScreen15Box2(it) },
            Box3 = { contentIarcusMiniScreen15Box3(it)
            })
    }
}



