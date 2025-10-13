package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1.contentIlgMiniScreen1.contentIlgMiniScreen1Box1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1.contentIlgMiniScreen1.contentIlgMiniScreen1Box2
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1.contentIlgMiniScreen1.contentIlgMiniScreen1Box3


@Composable
fun ilgMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.7f, Box3 = 0.05f),
            Box1 = { contentIlgMiniScreen1Box1() },
            Box2 = { contentIlgMiniScreen1Box2(it) },
            Box3 = { contentIlgMiniScreen1Box3() }
        )
    }
}