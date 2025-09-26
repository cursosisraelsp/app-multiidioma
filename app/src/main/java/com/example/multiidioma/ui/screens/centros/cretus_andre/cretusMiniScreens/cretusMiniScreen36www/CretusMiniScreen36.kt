package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen36www


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlCretus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate


@Composable
fun CretusMiniScreen36(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
){
    val url= urlCretus
    ScrollingEndScreenTemplate(
        data= data,
        modifier= modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}




