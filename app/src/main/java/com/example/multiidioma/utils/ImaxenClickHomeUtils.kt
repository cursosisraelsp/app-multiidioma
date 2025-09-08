package com.example.multiidioma.utils

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.ImaxenClickData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.imaxes.OrganicShape

@Composable
fun ImaxenClickHomeUtils(
    item: ImaxenClickData,
    onItemClick: (String) -> Unit){

    val context = LocalizedContext.current
    // Cada forma con su Box para controlar tamaño y offsets
    Box(
        modifier = Modifier
            .fillMaxSize(item.tamanho)
            //.size(item.tamanho) // tamaño máximo del Canvas
            .padding(0.dp)
            .border(width = 1.dp, color = Color.Red),
        contentAlignment = Alignment.Center
    ) {
        OrganicShape(
            modifier = Modifier
                .fillMaxSize()
                .offset(x = item.xOffset!!.dp, y = item.yOffset!!.dp)
                .clickable { onItemClick(item.id) } //item.<valor> debe coincidir do it.<valor> de DetailViewModel
                ,
            funcionImaxen = item.funcionImaxen,
            tamanho = item.tamanho
        )

        Box{
            Text(
                //text = item.title,
                text = runCatching { context.getString(item.title) }.getOrElse { "???" },
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 8.dp).offset(x = item.xOffset.dp, y = item.yOffset.dp)
            )
        }
    }



}