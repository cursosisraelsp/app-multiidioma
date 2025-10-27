package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.contentIlgMiniScreen7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.GifUrlStringComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIlgMiniScreen7Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.End,
        color = Color.Black

        )
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, start = 25.dp, end = 25.dp)

        ) {
            AppText(data, estilosTextos, index = 0)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp)
        ) {
            AppText(data, estilosTextos, index = 1)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
                /*.padding(start = 25.dp, end = 25.dp),*/
                horizontalAlignment = Alignment.CenterHorizontally

        ) {
            val gifIlg5 = "$urlRecursosApp/ANIMACIONS/ilg_anim_05.gif"
            GifUrlStringComponent(gif = gifIlg5, contentScale = ContentScale.Fit)
        }
    }
}