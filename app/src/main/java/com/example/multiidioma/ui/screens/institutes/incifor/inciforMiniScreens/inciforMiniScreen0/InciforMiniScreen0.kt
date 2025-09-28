package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.contentInciforMiniScreen0.contentInciforMiniScreen0Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.contentInciforMiniScreen0.contentIniciforMiniScreenBox3

@Composable
fun InciforMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier,
    listState: LazyListState,
    itemIndex: Int,
) {
// Calcular offset relativo al ítem
    val offset = if (listState.layoutInfo.visibleItemsInfo.any { it.index == itemIndex }) {
        val itemInfo = listState.layoutInfo.visibleItemsInfo.first { it.index == itemIndex }
        itemInfo.offset // posición Y del item en el scroll
    } else 0
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = modifier
                .align(Alignment.Center) // centra el contenido
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "ut_8lkPwRU4", // tu ID de video
                modifier = Modifier
                    //.fillMaxSize()
                    .fillMaxWidth()
                    //.height(150.dp)
                    .aspectRatio(9f / 16f)
                    .graphicsLayer {
                        translationY = offset * 0.5f // 👈 efecto parallax
                        translationX = offset * 0.5f
                    }
            )
        }

        TemplateScreen(
            data = data,
            Box2 = { contentInciforMiniScreen0Box2(it,offset) },
            Box3 = { contentIniciforMiniScreenBox3() }
        )
    }
}




