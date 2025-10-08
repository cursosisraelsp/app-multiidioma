package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4BodyText
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4CircleImage
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4TitleText
import com.example.multiidioma.utils.cimusUtils.CimusTemplateScreen1


@Composable
fun CimusMiniScreen4(
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
        CimusTemplateScreen1(
            navController = navController,
            data = data,
            CircleImage = { contentCimusMiniScreen4CircleImage(it) },
            TitleText = { contentCimusMiniScreen4TitleText(it) },
            BodyText = { contentCimusMiniScreen4BodyText(it) }
        )
    }
}

