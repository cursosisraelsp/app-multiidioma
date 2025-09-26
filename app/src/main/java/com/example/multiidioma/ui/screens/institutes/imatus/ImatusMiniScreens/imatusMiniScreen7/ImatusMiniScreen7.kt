package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen7

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
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5BodyText
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5CircleImage
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.contentImatusMiniScreen5.contentImatusMiniScreen5TitleText
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen7.contentImatusMiniScreen7.contentImatusMiniScreen7BodyText
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen7.contentImatusMiniScreen7.contentImatusMiniScreen7CircleImage
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen7.contentImatusMiniScreen7.contentImatusMiniScreen7TitleText
import com.example.multiidioma.utils.imatusUtils.ImatusTemplateScreen1
import com.example.multiidioma.utils.imatusUtils.ImatusTemplateScreen2
import com.example.multiidioma.utils.imatusUtils.ImatusTemplateScreen3


@Composable
fun ImatusMiniScreen7(
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
            VideoScreen(
                videoId = "ut_8lkPwRU4", // tu ID de video
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        ImatusTemplateScreen3(
            navController = navController,
            data = data,
            CircleImage = { contentImatusMiniScreen7CircleImage(it) },
            TitleText = { contentImatusMiniScreen7TitleText(it) },
            BodyText = { contentImatusMiniScreen7BodyText(it) }
        )
    }


}

