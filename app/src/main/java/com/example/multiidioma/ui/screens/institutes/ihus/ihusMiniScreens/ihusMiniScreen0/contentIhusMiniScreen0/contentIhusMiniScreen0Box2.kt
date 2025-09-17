 package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen0.contentIhusMiniScreen0
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Text.TextBodyMedium

 @Composable
fun contentIhusMiniScreen0Box2(data: MiniScreenData){
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )
     Column(
         modifier = Modifier
             .fillMaxSize()
             .padding(start = 40.dp, end = 40.dp)
         /*.background(Color.Green)*/

     ) {
         TextBodyMedium(data, estilosTextos)

     }
 }