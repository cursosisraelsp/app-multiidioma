package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen5.contentIarcusMiniScreen5






import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun contentIarcusMiniScreen5Box2(data: MiniScreenData){
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, bottom =  30.dp),
        alignment = Alignment.BottomCenter
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val estiloTextos =
            StyleText(style = MaterialTheme.typography.bodyMedium, color =(Color(0xFFFFFFFF)), textAlign = TextAlign.Center)


        AppText(data, estiloTextos, index=0)
        SpacerText()
        AppText(data, estiloTextos, index=1)
        SpacerText()
        ReusableImage(data, estilosImagen)

    }
}