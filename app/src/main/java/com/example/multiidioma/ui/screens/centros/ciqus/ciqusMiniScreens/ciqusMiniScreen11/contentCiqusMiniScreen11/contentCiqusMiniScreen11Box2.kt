package com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen11.contentCiqusMiniScreen11

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentCiqusMiniScreen11Box2(data: MiniScreenData, offset: Int, listState: LazyListState, itemIndex: Int) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center, color = Color.Black
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
                .weight(0.7f)
                .padding(start = 20.dp, top = 15.dp, end = 20.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
            SpacerText()
            AppText(data, estilosTextos, index = 1)
            SpacerText()
            AppText(data, estilosTextos, index = 2)
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(start = 20.dp, end =20.dp)
        ) {

           LottieScrollWithOffsetComponent(debuxoLottie = R.raw.ciqus_anim_04, listState, itemIndex)

        }

    }
}