package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.contentIdisMiniScreen14

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R


import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIdisMiniScreen14Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.End
    )

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(start = 50.dp, top = 15.dp, end = 50.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

        ) {

            GifComponent(
                gif = R.drawable.idis_anim_06
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}


