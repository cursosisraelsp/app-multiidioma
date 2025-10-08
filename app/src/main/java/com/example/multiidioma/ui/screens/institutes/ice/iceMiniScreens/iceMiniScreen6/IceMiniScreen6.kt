package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6

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
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6.contentIceMiniScreen6.contentIceMiniScreen6Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6.contentIceMiniScreen6.contentIceMiniScreen6Box2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6.contentIceMiniScreen6.contentIceMiniScreen6Box3


@Composable
fun IceMiniScreen6(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.7f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIceMiniScreen6Box1() },
            Box2 = { contentIceMiniScreen6Box2(it, navController) },
            Box3 = { contentIceMiniScreen6Box3() }
        )
    }
}




