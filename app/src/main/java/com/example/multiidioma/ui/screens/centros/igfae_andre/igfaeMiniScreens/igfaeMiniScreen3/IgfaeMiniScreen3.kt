package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3


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
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box1
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box2
import com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen3.contentIgfaeMiniScreen3.contentIgfaeMiniScreen3Box3

@Composable
fun IgfaeMiniScreen3(
    data: MiniScreenData,
    modifier: Modifier = Modifier,listState: LazyListState,
    itemIndex: Int
) {
    Box(
        modifier = modifier
            .fillMaxSize()

            .background(Color(0xFF32627E))
    ) {


        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.7f, Box3 = 0.15f),
            data = data,
            Box1 = { contentIgfaeMiniScreen3Box1() },
            Box2 = { contentIgfaeMiniScreen3Box2(it,listState, itemIndex) },
            Box3 = { contentIgfaeMiniScreen3Box3() })
    }
}



