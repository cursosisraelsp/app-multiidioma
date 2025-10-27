package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.contentIhusMiniScreen1


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIhusMiniScreen1Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomStart
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
        /*.background(Color.Green)*/

    ) {
        AppText(data, estilosTextos)

        Spacer(modifier = Modifier.height(25.dp))

        ImageAsincComponent(data, estilosImagen)


    }
}