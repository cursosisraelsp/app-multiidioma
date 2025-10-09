package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7.contentCimusMiniScreen7.contentCimusMiniScreen7Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7.contentCimusMiniScreen7.contentCimusMiniScreen7Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7.contentCimusMiniScreen7.contentCimusMiniScreen7Box3


@Composable
fun CimusMiniScreen7(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            data = data,
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.75f, Box3 = 0.15f),
            Box1 = { contentCimusMiniScreen7Box1() },
            Box2 = { contentCimusMiniScreen7Box2(it) },
            Box3 = { contentCimusMiniScreen7Box3() }
        )
    }
}
