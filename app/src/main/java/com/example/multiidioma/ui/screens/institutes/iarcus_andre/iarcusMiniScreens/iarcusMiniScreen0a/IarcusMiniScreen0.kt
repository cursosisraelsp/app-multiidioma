package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen0a

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
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen0a.contentIarcusMiniScreen0.contentIarcusMiniScreen0Box2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen0a.contentIarcusMiniScreen0.contentIarcusMiniScreen0Box3


@Composable
fun IarcusMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "", // tu ID de video
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.20f, Box2 = 0.50f, Box3 = 0.30f),
            data = data,
            Box2 = { contentIarcusMiniScreen0Box2(it) },
            Box3 = { contentIarcusMiniScreen0Box3() })
    }
}



