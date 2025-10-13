package com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowTemplateScreen
import com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12.contentIhusMiniScreen.contentFirstDirectiveImageMiniScreen12
import com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12.contentIhusMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen12
import com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12.contentIhusMiniScreen.contentSecondDirectiveImageMiniScreen12
import com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12.contentIhusMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen12



@Composable
fun IhusMiniScreen12(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        LazyRowTemplateScreen(
            data = data,
            navController = navController,
            podcasts = podcasts,
            FirstDirectiveImage = { contentFirstDirectiveImageMiniScreen12(it) },
            FirstDirectiveDescriptionText = { contentFirstDirectiveTextDescriptionMiniScreen12(it) },
            SecondDirectiveImage = { contentSecondDirectiveImageMiniScreen12(it) },
            SecondDirectiveDescriptionText = { contentSecondDirectiveTextDescriptionMiniScreen12(it) },
        )


    }
}