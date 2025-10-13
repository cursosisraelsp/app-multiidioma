package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13.contentCimusMiniScreen13.contentCimusMiniScreen13Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13.contentCimusMiniScreen13.contentCimusMiniScreen13Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13.contentCimusMiniScreen13.contentCimusMiniScreen13Box3

@Composable
fun CimusMiniScreen13(
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
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.13f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCimusMiniScreen13Box1() },
           Box2 = { contentCimusMiniScreen13Box2(data, navController)},
            Box3 = { contentCimusMiniScreen13Box3()}
        )
    }
}
