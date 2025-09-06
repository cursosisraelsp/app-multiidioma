package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.BoxLineRowComponent
import com.example.multiidioma.ui.components.TextWithCircle

@Composable
fun MiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    // Usa el contexto localizado que ya pusiste en CompositionLocalProvider
    val context = LocalizedContext.current

    Column(
        modifier = modifier.padding(0.dp).background(color = Color.Green),
        //verticalArrangement = Arrangement.Center
        ) {
        //LineCircleComponent()

        Row(modifier = Modifier.padding(1.dp)){
            Column (
                modifier = Modifier.fillMaxWidth(0.6f).fillMaxHeight().padding(end = 5.dp).background(Color.White).border(width = 1.dp, color = Color.Black),
                verticalArrangement = Arrangement.Center
            ){
                data.bodyParagraphs.forEach { res ->
                    Text(
                        textAlign = TextAlign.Left,
                        text =  runCatching { context.getString(res) }.getOrElse { "???" },
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
            Column(
                modifier = Modifier.fillMaxHeight().padding(1.dp).background(Color.Magenta),


            ){
                //Text(text= "en principio é outro", textAlign =
                Column ( modifier = Modifier.weight(1f)){
                    Column (){
                        TextWithCircle()
                        BoxLineRowComponent(0.4f)
                    }

                    Column(){
                        TextWithCircle()
                        BoxLineRowComponent(1f)
                    }
                }

                Column ( modifier = Modifier.weight(1f)){
                    Column (){
                        TextWithCircle()
                        BoxLineRowComponent(0.4f)
                    }

                    Column(){
                        TextWithCircle()
                        BoxLineRowComponent(1f)
                    }
                }
            }
        }
        //LineCircleComponent()
    }
}