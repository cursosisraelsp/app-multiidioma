package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.contentIhusMiniScreen9

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.data.StyleImages
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIhusMiniScreen9Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomEnd
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,

        )
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 25.dp, bottom = 25.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            AppText(data, estilosTextos, index = 1)
        }
    }
}