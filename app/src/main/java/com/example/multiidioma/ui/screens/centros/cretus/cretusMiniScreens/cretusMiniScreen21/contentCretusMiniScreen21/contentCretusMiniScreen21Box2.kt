package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen21.contentCretusMiniScreen21

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextTitleLarge

@Composable
fun contentCretusMiniScreen21Box2(
    data: MiniScreenData, listState: LazyListState,
    itemIndex: Int,
) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(top = 20.dp),
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //GifComponent(gif = R.drawable.cretus_vdo_03)

        SpacerText()

        TextTitleLarge(data, textAlign = TextAlign.Center)
    }
}