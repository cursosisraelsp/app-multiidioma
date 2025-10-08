package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen23

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen23.contentIceMiniScreen23.contentIceMiniScreen23Box1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen23.contentIceMiniScreen23.contentIceMiniScreen23Box2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen23.contentIceMiniScreen23.contentIceMiniScreen23Box3

@Composable
fun IceMiniScreen23(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
            TemplateScreen(
                BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.72f, Box3 = 0.18f),
                data = data,
                Box1 = { contentIceMiniScreen23Box1() },
                Box2 = { contentIceMiniScreen23Box2(it) },
                Box3 = { contentIceMiniScreen23Box3() }
            )
        }
    }
