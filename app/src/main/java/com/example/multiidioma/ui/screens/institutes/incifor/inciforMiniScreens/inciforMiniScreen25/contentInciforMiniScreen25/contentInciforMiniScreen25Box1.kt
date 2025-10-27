package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.contentInciforMiniScreen25

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.R
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.GifUrlStringComponent

@Composable
fun contentInciforMiniScreen25Box1(
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val gifIlg5 = "$urlRecursosApp/ANIMACIONS/incifor_anim_pantalla_embajadores.gif"
        GifUrlStringComponent(gif = gifIlg5, contentScale = ContentScale.Fit)
    }
}
