package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen11.contentIhusMiniScreen11.contentIhusMiniScreen11Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen11.contentIhusMiniScreen11.contentIhusMiniScreen11Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen11.contentIhusMiniScreen11.contentIhusMiniScreen11Box3

@Composable
fun IhusMiniScreen11(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.05f, Box2 = 0.7f, Box3 = 0.3f),
            data = data,
            Box1 = { contentIhusMiniScreen11Box1() },
            Box2 = { contentIhusMiniScreen11Box2(it)  },
            Box3 = { contentIhusMiniScreen11Box3()  },
        )
    }
}