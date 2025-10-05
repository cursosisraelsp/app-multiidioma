package com.example.multiidioma.utils

import android.content.res.Resources
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.multiidioma.data.types.ImaxenClickData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.imaxes.OrganicShape
import com.example.multiidioma.R
import com.example.multiidioma.data.corLetras
import com.example.multiidioma.ui.theme.AppTypography

@Composable
fun ImaxenClickHomeUtils(
    item: ImaxenClickData,
    onItemClick: (String) -> Unit,
    navController : NavHostController
    ){

    val context = LocalizedContext.current
    val des = Resources.getSystem().displayMetrics
    val numLetra = (60/des.density).sp

    // Cada forma con su Box para controlar tamaño y offsets
    Box(modifier = Modifier.fillMaxSize(item.tamanho).offset(x = item.xOffset, y = item.yOffset), contentAlignment = Alignment.Center){
        SvgImageComponent(R.raw.circulo_azul,
            modifier = Modifier.size(160.dp).clickable { onItemClick(item.id) })
        Text(
            //text = item.title,
            text = runCatching { context.getString(item.title) }.getOrElse { "???" },
            color = Color.White,
            modifier = Modifier.width(120.dp),
            fontFamily = AppTypography.displayLarge.fontFamily,
            fontSize = numLetra,
            textAlign = TextAlign.Center
        )
    }



}