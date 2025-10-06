package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20.contentIceMiniScreen20.contentIceMiniScreen20Box3
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20.contentIceMiniScreen20.contentIceMiniScreen20Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20.contentIceMiniScreen20.contentIceMiniScreen20Box2
@Composable
fun IceMiniScreen20(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.9f, Box3 = 0f),
            data = data,
            Box1 = { contentIceMiniScreen20Box1(it) },
            Box2 = { contentIceMiniScreen20Box2(it) },
            Box3 = { contentIceMiniScreen20Box3() }
        )
    }
}
