package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens0.imatusMiniScreen0


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.contentImatusMiniScreen0.contentImatusMiniScreen0Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.contentImatusMiniScreen0.contentImatusMiniScreen0Box3

@Composable
fun ImatusMiniScreen0(
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
                videoId = "ut_8lkPwRU4", // tu ID de video
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        TemplateScreen(
            data = data,
            Box2 = { contentImatusMiniScreen0Box2(it) },
            Box3 = { contentImatusMiniScreen0Box3() })
    }
}




