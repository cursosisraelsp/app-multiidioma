package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen3.contentIpsiusMiniScreen3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun ContentIpsiusMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.size(60.dp),
        alignment = Alignment.TopStart
    )

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        color = Color(0xFF000000),
        textAlign = TextAlign.Start
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        ReusableImage(data, estilosImagen)
        SpacerText()
        AppText(data, estilosTextos, index = 0)
        SpacerText()
        AppText(data, estilosTextos, index = 1)
    }
}
