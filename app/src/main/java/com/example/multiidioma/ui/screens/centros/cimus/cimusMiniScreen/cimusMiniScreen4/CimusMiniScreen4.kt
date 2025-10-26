package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.centros.cimus.cimusMiniScreen.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4Box1
import com.example.multiidioma.ui.screens.centros.cimus.cimusMiniScreen.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4Box2
import com.example.multiidioma.ui.screens.centros.cimus.cimusMiniScreen.cimusMiniScreen4.contentCimusMiniScreen4.contentCimusMiniScreen4Box3


@Composable
fun CimusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.8f, Box3 = 0.1f),
            data = data,
            Box1 = { contentCimusMiniScreen4Box1() },
            Box2 = { contentCimusMiniScreen4Box2(it) },
            Box3 = { contentCimusMiniScreen4Box3() },

            )
    }
}




/*
Box(
modifier = modifier
.fillMaxSize()
.background(Color(0xFF66AAD1))
) {
    Column(
        modifier = modifier
            .fillMaxSize()

    ) {
        LineVerticalComponent(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 50.dp),
            contentAlignment = Alignment.TopStart,
        )
    }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
    ) {
    }
    CimusTemplateScreen1(data)
}
Column(
modifier = modifier
.fillMaxWidth()
.fillMaxHeight(0.15f)
) {
    LineVerticalComponent(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
}
}
*/

