package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1.contentIlgMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R


import com.example.multiidioma.data.data.StyleImages
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIlgMiniScreen1Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomStart
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(start = 20.dp, top = 15.dp, end = 10.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(start = 20.dp, end = 10.dp)
        )

        {
            AppText(data, estilosTextos, index = 1)

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(bottom = 10.dp),
                contentAlignment = Alignment.Center

        ) {

            GifComponent(gif = R.drawable.ilg_anim_01, contentScale = ContentScale.Fit)
        }

    }
}