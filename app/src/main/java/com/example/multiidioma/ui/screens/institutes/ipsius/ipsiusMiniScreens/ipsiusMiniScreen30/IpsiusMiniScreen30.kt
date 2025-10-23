package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen30


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
fun IpsiusMiniScreen30(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFBCE0F0))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.90f, Box3 = 0f),
            Box1 = { contentIpsiusMiniScreen30Box1() },
            Box2 = {
                contentIpsiusMiniScreen30Box2(
                    it,
                    buttonTextIndex = 3,
                    buttonLink = "https://www.usc.gal/es/investigar-usc/investigar/intitutos-centros-investigacion/institutos/IPsiUS"
                )
            }
        )
    }
}



