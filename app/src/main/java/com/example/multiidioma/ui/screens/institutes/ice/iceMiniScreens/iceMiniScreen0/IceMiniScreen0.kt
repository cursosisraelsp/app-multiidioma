package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen0

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen0.contentIceMiniScreen0.contentIceMiniScreen0Box2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen0.contentIceMiniScreen0.contentIceMiniScreen0Box3


@Composable
fun IceMiniScreen0(
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
            VideoScreen(
                videoId = "paWE-GvDO1c",
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.25f, Box2 = 0.5f, Box3 = 0.25f),
            data = data,
            Box2 = { contentIceMiniScreen0Box2(it, listState, itemIndex) },
            Box3 = { contentIceMiniScreen0Box3() },
        )
    }
}
