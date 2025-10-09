package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen1

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
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen1.contentCimusMiniScreen1.contentCimusMiniScreen1Box1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen1.contentCimusMiniScreen1.contentCimusMiniScreen1Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen1.contentCimusMiniScreen1.contentCimusMiniScreen1Box3

@Composable
fun CimusMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    listState: LazyListState,
    itemIndex: Int,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.2f, Box2 = 0.8f, Box3 = 0.2f),
            data = data,
            Box1 = { contentCimusMiniScreen1Box1() },
            Box2 = { contentCimusMiniScreen1Box2(it) },
            Box3 = { contentCimusMiniScreen1Box3() },

            )
    }
}
