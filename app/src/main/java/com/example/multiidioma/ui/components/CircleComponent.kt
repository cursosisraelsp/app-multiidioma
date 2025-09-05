package com.example.multiidioma.ui.components


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
// 15 , 15
@Composable
fun CircleComponent(width: Dp, height: Dp,widthBox: Float){
    Box(modifier = Modifier.fillMaxWidth(widthBox).background(color = Color.Green).border(width = 1.dp, color = Color.Red),contentAlignment = Alignment.Center){
        Box(modifier = Modifier.size(width,height),contentAlignment = Alignment.Center){
            Canvas(modifier = Modifier.fillMaxSize()) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawCircle(
                    color = Color.Black,
                    center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                    radius = size.minDimension/2,
                    style = Stroke(5F)
                )
            }
        }
    }




}