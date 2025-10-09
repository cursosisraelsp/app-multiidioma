package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen0

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
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen0.contentCimusMiniScreen0.contentCimusMiniScreen0Box2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen0.contentCimusMiniScreen0.contentCimusMiniScreen0Box3


@Composable
fun CimusMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    listState: LazyListState,
    itemIndex: Int
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VimeoWebViewComponent(identificador = "1124126415", width = "425px", height = "800px")
        }
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.5f, Box3 = 0.25f),
            data = data,
            Box2 = { contentCimusMiniScreen0Box2(it, listState, itemIndex) },
            Box3 = { contentCimusMiniScreen0Box3() },
        )
    }
}
