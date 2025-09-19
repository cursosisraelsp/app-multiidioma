package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen0a

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen0a.contentIgfaeMiniScreen0.contentIgfaeMiniScreen0Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen0a.contentIgfaeMiniScreen0.contentIgfaeMiniScreen0Box3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen0.contentIpsiusMiniScreen0.contentIpsiusMiniScreen0Box3





@Composable
fun IgfaeMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {


        PlantillaScreen(
            data = data,
            Box2 = { contentIgfaeMiniScreen0Box2(it) },
            Box3 = { contentIgfaeMiniScreen0Box3()
            }
        )
    }
}







