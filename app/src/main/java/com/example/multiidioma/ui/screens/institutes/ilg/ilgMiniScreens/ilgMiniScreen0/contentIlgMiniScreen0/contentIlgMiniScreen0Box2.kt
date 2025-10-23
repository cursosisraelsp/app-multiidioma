 package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen0.contentIlgMiniScreen0
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText

 @Composable
fun contentIlgMiniScreen0Box2(data: MiniScreenData){
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )
     Column(
         modifier = Modifier
             .fillMaxSize()
             /*.padding(start = 40.dp, end = 40.dp)*/
         /*.background(Color.Green)*/

     ) {
         AppText(data, estilosTextos)

     }
 }