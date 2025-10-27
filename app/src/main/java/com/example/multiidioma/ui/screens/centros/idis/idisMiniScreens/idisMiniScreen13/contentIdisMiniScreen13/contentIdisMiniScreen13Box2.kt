package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13.contentIdisMiniScreen13


import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.GifUrlStringComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIdisMiniScreen13Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center
    )

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.65f)
                .padding(start = 10.dp, top = 15.dp, end = 10.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
            Spacer(modifier = Modifier.height(15.dp))
            AppText(data, estilosTextos, index = 1)
            Spacer(modifier = Modifier.height(15.dp))
            AppText(data, estilosTextos, index = 2)
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(end = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

        ) {

            val gifIlg5 = "$urlRecursosApp/ANIMACIONS/idis_anim_06.gif"
            GifUrlStringComponent(gif = gifIlg5, contentScale = ContentScale.Fit)
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}


