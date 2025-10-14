package com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen4a


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen4a.contentCretusMiniScreen4.contentCretusMiniScreen4Box2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen4a.contentCretusMiniScreen4.contentCretusMiniScreen4Box3


@Composable
fun CretusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {

        }
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.00f, Box2 = 0.70f, Box3 = 0.30f),
            data = data,
            Box2 = { contentCretusMiniScreen4Box2(it) },
            Box3 = { contentCretusMiniScreen4Box3() })
    }
}



