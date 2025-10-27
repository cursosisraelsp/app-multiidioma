package com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.contentIdisMiniScreen16

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.R
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.GifUrlStringComponent

@Composable
fun contentIdisMiniScreen16Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val gifIlg5 = "$urlRecursosApp/ANIMACIONS/idis_anim_06.gif"
        GifUrlStringComponent(gif = gifIlg5, contentScale = ContentScale.FillBounds)
    }
}