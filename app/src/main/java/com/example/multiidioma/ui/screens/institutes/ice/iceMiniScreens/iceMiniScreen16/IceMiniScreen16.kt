package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16.contentIceMiniScreen16.contentIceMiniScreen16Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16.contentIceMiniScreen16.contentIceMiniScreen16Box2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16.contentIceMiniScreen16.contentIceMiniScreen16Box3

@Composable
fun IceMiniScreen16(
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
            Box1 = { contentIceMiniScreen16Box1(it) },
            Box2 = { contentIceMiniScreen16Box2(it) },
            Box3 = { contentIceMiniScreen16Box3() }
        )
    }
}
