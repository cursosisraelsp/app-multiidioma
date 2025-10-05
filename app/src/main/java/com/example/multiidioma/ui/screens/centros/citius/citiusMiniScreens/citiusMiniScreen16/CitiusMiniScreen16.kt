package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.contentCitiusMiniScreen16.contentCitiusMiniScreen16Box1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.contentCitiusMiniScreen16.contentCitiusMiniScreen16Box2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.contentCitiusMiniScreen16.contentCitiusMiniScreen16Box3


@Composable
fun CitiusMiniScreen16(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {

        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.40f, Box3 = 0.15f),
            data = data,
            Box1 = { contentCitiusMiniScreen16Box1() },
            Box2 = { contentCitiusMiniScreen16Box2(it) },
            Box3 = { contentCitiusMiniScreen16Box3() }
        )
    }
}
