package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen20


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen20Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.Fit
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp)
    ) {
        SpacerText()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
        ) {
            ImageAsincComponent(data, estilosImagen)
        }
        Spacer(modifier = Modifier.height(25.dp))

        TextBodyMedium(data, index = 0, textAlign = TextAlign.Center) //Titulo 2
        Spacer(modifier = Modifier.height(25.dp))

        TextBodyMedium(data, index = 1, textAlign = TextAlign.Center)//parrafo1
        Spacer(modifier = Modifier.height(25.dp))

        TextBodyMedium(data, index = 2, textAlign = TextAlign.Center) //Parrafo2
    }
}


