package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.contentIhusMiniScreen9.contentIhusMiniScreen9Box1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.contentIhusMiniScreen9.contentIhusMiniScreen9Box2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.contentIhusMiniScreen9.contentIhusMiniScreen9Box3

@Composable
fun IhusMiniScreen9(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.6f, Box3 = 0.3f),
            data = data,
            Box1 = { contentIhusMiniScreen9Box1(it) },
            Box2 = { contentIhusMiniScreen9Box2(it)  },
            Box3 = { contentIhusMiniScreen9Box3(it)  },
        )
    }
}