package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen22


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen22.contentCretusMiniScreen22.contentCretusMiniScreen22Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen22.contentCretusMiniScreen22.contentCretusMiniScreen22Box2
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen22.contentCretusMiniScreen22.contentCretusMiniScreen22Box3


@Composable
fun CretusMiniScreen22(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        PlantillaScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.4f, Box3 = 0.3f),
            Box1 = { contentCretusMiniScreen22Box1(it) },
            Box2 = { contentCretusMiniScreen22Box2(it) },
            Box3 = { contentCretusMiniScreen22Box3() })
    }
}



