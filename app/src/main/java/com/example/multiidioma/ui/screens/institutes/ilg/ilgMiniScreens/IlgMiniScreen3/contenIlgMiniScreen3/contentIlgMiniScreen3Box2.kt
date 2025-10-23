package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.contenIlgMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.AppText

@Composable
fun contentIlgMiniScreen3Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center, color = Color.Black
    )
    val estilosTextos1 = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start, color = Color.Black
    )
    val estilosTextos2 = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start, color = Color.Black
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
          /*  .padding(top = 40.dp, bottom = 15.dp, start = 50.dp, end = 50.dp)
           */ .background(color = Color.Green),
        horizontalAlignment = AbsoluteAlignment.Right
        //verticalArrangement = Arrangement.SpaceBetween
    ) {
        //AppText(data, estilosTextos, index = 0)
        Column (modifier = Modifier.weight(0.7f).border(
            width = 1.dp,
            color = Color.Black
        ),
            //verticalArrangement = Arrangement.Center
            ) {
            AppText(data, estilosTextos,index = 0)
            Row(){
                AppText(data, estilosTextos1,index = 1)
                AppText(data, estilosTextos2,index = 2)
                //Text("${stringResource(data.bodyParagraphs[1])}")
                //Text("${stringResource(data.bodyParagraphs[2])}")
            }
            //AppText(data, estilosTextos2,index = 2)//este sae
            //ReusableImage(data, estilosImagen)
        }
    }
}