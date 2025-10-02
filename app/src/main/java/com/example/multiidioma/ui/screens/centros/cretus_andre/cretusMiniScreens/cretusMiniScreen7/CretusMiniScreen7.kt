package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen7


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen7.contentCretusMiniScreen7.contentCretusMiniScreen7Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen7.contentCretusMiniScreen7.contentCretusMiniScreen7Box2

@Composable
fun CretusMiniScreen7(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.90f, Box3 = 0f),
            Box1 = { contentCretusMiniScreen7Box1() },
            Box2 = { contentCretusMiniScreen7Box2(it) },
        )
    }
}




