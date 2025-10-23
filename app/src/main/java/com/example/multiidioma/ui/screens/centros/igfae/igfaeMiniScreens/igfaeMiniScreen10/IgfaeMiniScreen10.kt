package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.IgfaeMiniScreen10a


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
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10Box1
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10Box2
import com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen10a.contentCretusMiniScreen10.contentIgfaeMiniScreen10Box3


@Composable
fun IgfaeMiniScreen10(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.8f, Box3 = 0.1f),
            Box1 = { contentIgfaeMiniScreen10Box1() },
            Box2 = { contentIgfaeMiniScreen10Box2(it,navController) },
            Box3 = { contentIgfaeMiniScreen10Box3() }
        )
    }
}



