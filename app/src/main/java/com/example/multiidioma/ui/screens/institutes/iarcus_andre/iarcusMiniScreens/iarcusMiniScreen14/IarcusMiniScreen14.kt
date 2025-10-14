package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14.contentIarcusMiniScreen14Box3


@Composable
fun IarcusMiniScreen14(
    data: MiniScreenData,
    modifier: Modifier = Modifier,listState: LazyListState,
    itemIndex: Int
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.70f, Box3 = 0.15f),
            Box1 = { contentIarcusMiniScreen14Box1() },
            Box2 = { contentIarcusMiniScreen14Box2(it,listState, itemIndex) },
            Box3 = { contentIarcusMiniScreen14Box3() })
    }
}



