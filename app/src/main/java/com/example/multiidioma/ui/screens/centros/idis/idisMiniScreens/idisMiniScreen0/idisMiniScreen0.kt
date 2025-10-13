package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen0

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen0.contentIdisMiniScreen0.contentIdisMiniScreenBox3
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen0.contentIdisMiniScreen0.contentIdisMiniScreen0Box2


@Composable
fun idisMiniScreen0(
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

            VimeoWebViewComponent(identificador = "1124127351",width="425px", height = "800px")
            /*VideoScreen(videoId = "92UgRKX8ooM", // tu ID de video
                modifier = Modifier.fillMaxSize().aspectRatio(9f / 16f))*/
        }
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                TemplateScreen(
                    data = data,
                    Box2 = { contentIdisMiniScreen0Box2(it) },
                    Box3 = { contentIdisMiniScreenBox3() }
            )
            }
        }
    }
