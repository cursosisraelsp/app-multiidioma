package com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen3


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen3.contentIarcusMiniScreen3.ContentIarcusMiniScreen3Box1
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen3.contentIarcusMiniScreen3.ContentIarcusMiniScreen3Box2


@Composable
fun IarcusMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()

            .background(Color(0xFFE5F4F9))
    ) {


        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.54f, Box3 = 0.01f),
            data = data,
            Box1 = { ContentIarcusMiniScreen3Box1(it) },

            Box2 = { ContentIarcusMiniScreen3Box2() })
    }
}



