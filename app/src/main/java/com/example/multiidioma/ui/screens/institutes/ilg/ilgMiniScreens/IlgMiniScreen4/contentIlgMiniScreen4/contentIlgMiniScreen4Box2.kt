package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen4.contentIlgMiniScreen4

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.data.StyleImages
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentIlgMiniScreen4Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
        color = Color.Black
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp)
        ) {
            AppText(data, estilosTextos, index = 0)
            Spacer(modifier = Modifier.height(15.dp))
            AppText(data, estilosTextos, index = 1)
        }
        Spacer(modifier = Modifier.height(15.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
    }

