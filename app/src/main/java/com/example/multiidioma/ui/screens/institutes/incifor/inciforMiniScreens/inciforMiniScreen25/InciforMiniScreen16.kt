package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.contentInciforMiniScreen25.contentInciforMiniScreen25Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.contentInciforMiniScreen25.contentInciforMiniScreen25Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.contentInciforMiniScreen25.contentInciforMiniScreen25Box3


@Composable
fun InciforMiniScreen25(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.40f, Box3 = 0.15f),
            data = data,
            Box1 = { contentInciforMiniScreen25Box1(it) },
            Box2 = { contentInciforMiniScreen25Box2(it) },
            Box3 = { contentInciforMiniScreen25Box3() }
        )
    }
}
