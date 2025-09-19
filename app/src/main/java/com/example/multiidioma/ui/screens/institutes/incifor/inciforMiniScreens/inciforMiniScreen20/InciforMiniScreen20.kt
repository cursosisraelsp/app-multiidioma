package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen20

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen


@Composable
fun InciforMiniScreen20(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.4f, Box2 = 0.4f, Box3 = 0.2f),
            data = data,
            Box1 = { contentInciforMiniScreen20Box1(it)},
            Box2 = { contentInciforMiniScreen20Box2(it)},
            Box3 = { contentInciforMiniScreen20Box3()}
        )
    }
}

