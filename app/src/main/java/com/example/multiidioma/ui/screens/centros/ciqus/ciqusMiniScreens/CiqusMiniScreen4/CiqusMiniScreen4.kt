package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4

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
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4.contentCiqusMiniScreen4.contentCiqusMiniScreen4Box1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4.contentCiqusMiniScreen4.contentCiqusMiniScreen4Box2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4.contentCiqusMiniScreen4.contentCiqusMiniScreen4Box3


@Composable
fun CiqusMiniScreen4(
   data : MiniScreenData,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.85f, Box3 = 0.05f),
            data = data,
            Box1 = { contentCiqusMiniScreen4Box1(it) },
            Box2 = { contentCiqusMiniScreen4Box2(it, navController) },
            Box3 = { contentCiqusMiniScreen4Box3() }
        )
    }
}
