package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen1


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
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen1.contentIpsiusMiniScreen1.contentIpsiusMiniScreen1Box1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen1.contentIpsiusMiniScreen1.contentIpsiusMiniScreen1Box2



@Composable
fun IpsiusMiniScreen1(
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
            data = data,
            BoxWeight = BOX(Box1 = 0.10f, Box2 = 0.90f, Box3 = 0.0f),
            Box1 = { contentIpsiusMiniScreen1Box1()},
            Box2 = { contentIpsiusMiniScreen1Box2(it,listState, itemIndex) },
        )

    }
}
