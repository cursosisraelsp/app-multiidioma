package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen0

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
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen0.contentIlgMiniScreen0.contentIlgMiniScreenBox3
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen0.contentIlgMiniScreen0.contentIlgMiniScreen0Box2


@Composable
fun ilgMiniScreen0(
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

            VimeoWebViewComponent(identificador = "1124127625",width="425px", height = "800px")
        }
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                TemplateScreen(
                    data = data,
                    Box2 = { contentIlgMiniScreen0Box2(it) },
                    Box3 = { contentIlgMiniScreenBox3() })
            }
        }
    }
