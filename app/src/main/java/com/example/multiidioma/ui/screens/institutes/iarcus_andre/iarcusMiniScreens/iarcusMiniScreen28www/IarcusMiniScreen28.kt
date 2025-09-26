package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen28www


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.urlIarcus
import com.example.multiidioma.ui.components.Templates.ScrollingEndScreenTemplate


@Composable
fun IarcusMiniScreen28(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
){
    val url= urlIarcus
    ScrollingEndScreenTemplate(
        data= data,
        modifier= modifier,
        buttonTextIndex = 1,
        buttonLink = url
    )
}



