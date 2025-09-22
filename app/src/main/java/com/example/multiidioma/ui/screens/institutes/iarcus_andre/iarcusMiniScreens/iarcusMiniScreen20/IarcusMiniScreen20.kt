package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen20



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen20.contentIarcusMiniScreen20.contentIarcusMiniScreen20Box1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen20.contentIarcusMiniScreen20.contentIarcusMiniScreen20Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen20.contentIarcusMiniScreen20.contentIarcusMiniScreen20Box3

@Composable
fun IarcusMiniScreen20(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {


        PlantillaScreen(
            data = data,
            Box1 = { contentIarcusMiniScreen20Box1(it) },
            Box2 = { contentIarcusMiniScreen20Box2(it) },
            Box3 = { contentIarcusMiniScreen20Box3() })
    }
}


