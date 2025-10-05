package com.example.multiidioma.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.multiidioma.data.corLetras
import com.example.multiidioma.data.types.NavegationFiguresData
import com.example.multiidioma.ui.theme.AppTypography
import com.example.multiidioma.utils.SvgImageComponent

@Composable
fun NavigationFiguresComponent(valorFigura : NavegationFiguresData,navController: NavController){
    Box(modifier = Modifier
        .offset(x = valorFigura.offset_x,y = valorFigura.offset_y), contentAlignment = Alignment.Center)
    {
        SvgImageComponent(
            resId = valorFigura.imaxen,
            modifier = Modifier.size(valorFigura.tamanhoFigura).clickable {
                navController.navigate(valorFigura.ruta)
            }
        )
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                valorFigura.numString!!,
                color = corLetras,
                fontFamily = AppTypography.displayLarge.fontFamily,
                fontSize = valorFigura.relacionNum!!)
            Text(
                valorFigura.textoInfo,
                color = corLetras,
                modifier = Modifier.width(valorFigura.anchoTexto),
                fontFamily = AppTypography.displayLarge.fontFamily,
                fontSize = valorFigura.relacionText, textAlign = TextAlign.Center)

        }

    }
}