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
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen10.contentIhusMiniScreen10.contentIhusMiniScreen10Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen10.contentIhusMiniScreen10.contentIhusMiniScreen10Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen10.contentIhusMiniScreen10.contentIhusMiniScreen10Box3

@Composable
fun IhusMiniScreen10(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.6f, Box3 = 0.2f),
            data = data,
            Box1 = { contentIhusMiniScreen10Box1(it) },
            Box2 = { contentIhusMiniScreen10Box2(it)  },
            Box3 = { contentIhusMiniScreen10Box3(it)  },
        )
    }
}