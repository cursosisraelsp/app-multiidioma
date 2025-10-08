package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen25

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen25.contentIceMiniScreen25.contentIceMiniScreen25Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen25.contentIceMiniScreen25.contentIceMiniScreen25Box2

@Composable
fun IceMiniScreen25(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.85f, Box3 = 0f),
            data = data,
            Box1 = { contentIceMiniScreen25Box1(it) },
            Box2 = { contentIceMiniScreen25Box2(it) },

        )
    }
}
