package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2.contentIhusMiniScreen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleImages
import com.example.multiidioma.data.repository.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.TextBodyMedium


@Composable
fun contentIhusMiniScreen2Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center
    )
    val estilosTextos =
        StyleText(style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start, color = Color.Black)

    Column {
       Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f)
                .padding(start = 20.dp, end = 20.dp)
        ) {
            TextBodyMedium(data, estilosTextos, index = 0)


        Spacer(modifier = Modifier.height(10.dp))

          TextBodyMedium(data, estilosTextos, index = 1)}


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
        )
        {
            ReusableImage(data, estilosImagen)
        }
    }
}