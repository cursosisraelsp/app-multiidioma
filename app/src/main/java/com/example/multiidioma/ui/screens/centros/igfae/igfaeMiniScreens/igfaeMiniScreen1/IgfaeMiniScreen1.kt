package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen1.contentIgfaeMiniScreen1.contentIgfaeMiniScreen1Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen1.contentIgfaeMiniScreen1.contentIgfaeMiniScreen1Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen1.contentIgfaeMiniScreen1.contentIgfaeMiniScreen1Box3


@Composable
fun IgfaeMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,listState: LazyListState,
    itemIndex: Int
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xFF32627E))
    ) {
       TemplateScreen(
           BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.80f, Box3 = 0.1f),
            data = data,
            Box1 = { contentIgfaeMiniScreen1Box1() },
            Box2 = { contentIgfaeMiniScreen1Box2(it,listState, itemIndex) },
            Box3 = { contentIgfaeMiniScreen1Box3() })

    }
}
