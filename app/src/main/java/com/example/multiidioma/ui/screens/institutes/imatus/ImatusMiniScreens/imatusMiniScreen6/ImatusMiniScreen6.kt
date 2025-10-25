package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen6.contentImatusMiniScreen6.contentImatusMiniScreen6BodyText
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen6.contentImatusMiniScreen6.contentImatusMiniScreen6CircleImage
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen6.contentImatusMiniScreen6.contentImatusMiniScreen6TitleText
import com.example.multiidioma.utils.imatusUtils.ImatusTemplateScreen2


@Composable
fun ImatusMiniScreen6(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VimeoWebViewComponent(identificador = "1124127639", width = "425px", height = "800px")
        }
        ImatusTemplateScreen2(
            navController = navController,
            data = data,
            CircleImage = { contentImatusMiniScreen6CircleImage(it) },
            TitleText = { contentImatusMiniScreen6TitleText(it) },
            BodyText = { contentImatusMiniScreen6BodyText(it) }
        )
    }
}

