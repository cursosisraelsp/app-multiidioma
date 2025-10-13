package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.contentCiqusMiniScreen9

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R


import com.example.multiidioma.data.data.StyleImages
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentCiqusMiniScreen9Box2(data: MiniScreenData, offset: Int, listState: LazyListState, itemIndex: Int) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center, contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, top = 15.dp, end = 50.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, end =10.dp, bottom = 10.dp)
        ) {

           LottieScrollWithOffsetComponent(debuxoLottie = R.raw.ciqus_anim_02, listState, itemIndex)

        }

    }
}