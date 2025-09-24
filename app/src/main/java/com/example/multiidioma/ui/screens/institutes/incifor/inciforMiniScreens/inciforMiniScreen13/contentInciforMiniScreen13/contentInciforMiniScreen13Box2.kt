package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multiidioma.utils.SvgImageUtils
import com.example.multiidioma.R
@Composable
fun contentInciforMiniScreen13Box2() {

    Box(modifier = Modifier
        .border(width = 1.dp, color = Color.Black)
        .offset(x=50.dp,y=20.dp), contentAlignment = Alignment.Center){
        SvgImageUtils(
            resId = R.raw.circulo_blanco,
            modifier = Modifier.size(150.dp)
        )
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Text("03")
            Text("este texto en Incifor")
        }

    }
    Box(modifier = Modifier
        .border(width = 1.dp, color = Color.Black)
        .offset(x=13.dp,y=175.dp), contentAlignment = Alignment.Center){
        SvgImageUtils(
            resId = R.raw.circulo_blanco,
            modifier = Modifier.size(400.dp)
        )
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Text("03")
            Text("este texto en Incifor")
        }

    }


}

/*
@Preview(showBackground = true)
@Composable
fun PreviewWithTheme() {
    contentInciforMiniScreen13Box2()
}
*/


