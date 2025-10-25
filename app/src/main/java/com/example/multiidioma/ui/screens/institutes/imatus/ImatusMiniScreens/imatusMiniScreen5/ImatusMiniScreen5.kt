package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen5

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
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5BodyText
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5CircleImage
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5TitleText
import com.example.multiidioma.utils.imatusUtils.ImatusTemplateScreen1


@Composable
fun ImatusMiniScreen5(
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
            VimeoWebViewComponent(identificador = "1124127679", width = "425px", height = "800px")
        }
        ImatusTemplateScreen1(
            navController = navController,
            data = data,
            CircleImage = { contentImatusMiniScreen5CircleImage(it) },
            TitleText = { contentImatusMiniScreen5TitleText(it) },
            BodyText = { contentImatusMiniScreen5BodyText(it) }
        )
    }
}

