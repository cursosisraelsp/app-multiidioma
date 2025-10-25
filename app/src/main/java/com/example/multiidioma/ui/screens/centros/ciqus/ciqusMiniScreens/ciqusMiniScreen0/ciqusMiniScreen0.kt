package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen0

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen0.contentCiqusMiniScreen0.contentCiqusMiniScreenBox3
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen0.contentCiqusMiniScreen0.contentCiqusMiniScreen0Box2


@Composable
fun ciqusMiniScreen0(
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
                .fillMaxSize().background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {

            VimeoWebViewComponent(identificador = "1124126945",width="425px", height = "800px")
            /*VideoScreen(videoId = "92UgRKX8ooM", // tu ID de video
                modifier = Modifier.fillMaxSize().aspectRatio(9f / 16f))*/
        }
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                TemplateScreen(
                    data = data,
                    Box2 = { contentCiqusMiniScreen0Box2(it) },
                    Box3 = { contentCiqusMiniScreenBox3() }
            )
            }
        }
    }
