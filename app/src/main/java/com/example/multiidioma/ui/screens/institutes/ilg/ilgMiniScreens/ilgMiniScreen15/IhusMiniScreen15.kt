package com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen15

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
import com.example.multiidioma.ui.components.Templates.LazyRowTemplateScreenFER_AND
import com.example.multiidioma.ui.screens.institutes.ilg.ihusMiniScreens.ilgMiniScreen12.contentIlgMiniScreen.contentSecondDirectiveImageMiniScreen15
import com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen15.contentIlgMiniScreen.contentFirstDirectiveImageMiniScreen15
import com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen15.contentIlgMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen15
import com.example.multiidioma.ui.screens.institutes.ilg.ilgMiniScreens.ilgMiniScreen15.contentIlgMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen15


@Composable
fun IlgMiniScreen15(
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
        LazyRowTemplateScreenFER_AND(
            data = data,
            navController = navController,
            podcasts = podcasts,
            FirstDirectiveImage = { contentFirstDirectiveImageMiniScreen15(it) },
            FirstDirectiveDescriptionText = { contentFirstDirectiveTextDescriptionMiniScreen15(it) },
            SecondDirectiveImage = { contentSecondDirectiveImageMiniScreen15(it) },
            SecondDirectiveDescriptionText = { contentSecondDirectiveTextDescriptionMiniScreen15(it) },
        )


    }
}