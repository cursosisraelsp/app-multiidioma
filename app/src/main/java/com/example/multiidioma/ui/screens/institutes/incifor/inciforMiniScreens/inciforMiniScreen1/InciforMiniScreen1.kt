package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1.contentInciforMiniScreen1Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1.contentInciforMiniScreen1Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1.contentInciforMiniScreen1Box3


@Composable
fun InciforMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.6f, Box3 = 0.15f),
            Box1 = { contentInciforMiniScreen1Box1() },
            Box2 = { contentInciforMiniScreen1Box2(it) },
            Box3 = { contentInciforMiniScreen1Box3() }
        )
    }
}
