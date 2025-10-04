package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.contentCitiusMiniScreen15.contentCitiusMiniScreen15Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.contentCitiusMiniScreen15.contentCitiusMiniScreen15Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.contentCitiusMiniScreen15.contentCitiusMiniScreen15Box3

@Composable
fun CitiusMiniScreen15(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.6f, Box3 = 0.2f),
            data = data,
            Box1 = { contentCitiusMiniScreen15Box1() },
            Box2 = { contentCitiusMiniScreen15Box2(it) },
            Box3 = { contentCitiusMiniScreen15Box3() }
        )
    }
}
