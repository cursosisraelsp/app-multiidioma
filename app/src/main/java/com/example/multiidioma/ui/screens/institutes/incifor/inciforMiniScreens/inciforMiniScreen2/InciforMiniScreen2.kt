package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2


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
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box3

@Composable
fun InciforMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    listState: LazyListState,
    itemIndex: Int,
) {
    // Buscar info de este item en la lista visible
    val itemInfo = listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == itemIndex }

    // Offset vertical real en píxeles
    val offset = itemInfo?.let {
        it.offset - listState.firstVisibleItemScrollOffset
    } ?: 0
// Calcular offset relativo al ítem
    /*val offset = if (listState.layoutInfo.visibleItemsInfo.any { it.index == itemIndex }) {
        val itemInfo = listState.layoutInfo.visibleItemsInfo.first { it.index == itemIndex }
        itemInfo.offset // posición Y del item en el scroll
    } else 0*/
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.55f, Box3 = 0.3f),
            data = data,
            Box1 = { contentInciforMiniScreen2Box1() },
            Box2 = { contentInciforMiniScreen2Box2(it,offset) },
            Box3 = { contentInciforMiniScreen2Box3() }
        )
    }
}


