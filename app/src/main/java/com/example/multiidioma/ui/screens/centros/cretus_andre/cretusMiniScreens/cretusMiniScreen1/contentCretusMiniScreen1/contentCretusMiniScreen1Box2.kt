package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen1.contentCretusMiniScreen1




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentCretusMiniScreen1Box2(data: MiniScreenData){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)

    ) {
        val estiloTextos =
            StyleText(style = MaterialTheme.typography.bodyMedium, color =(Color(0xFFFFFFFF)), textAlign = TextAlign.Center);

        TextBodyMedium(data, estiloTextos)
        TextBodyMedium(data, estiloTextos)

    }
}
