package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen

import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.contentIdisMiniScreen16.contentIdisMiniScreen16Box1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.contentIdisMiniScreen16.contentIdisMiniScreen16Box2
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.contentIdisMiniScreen16.contentIdisMiniScreen16Box3

@Composable
fun IdisMiniScreen16(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.45f, Box2 = 0.4f, Box3 = 0.15f),
            data = data,
            Box1 = { contentIdisMiniScreen16Box1() },
            Box2 = { contentIdisMiniScreen16Box2(it)  },
            Box3 = { contentIdisMiniScreen16Box3()  },
        )
    }
}