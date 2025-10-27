package com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.contentIdisMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.ImageAsincComponent
import com.example.multiidioma.ui.components.Images.ReusableImage


@Composable
fun contentIdisMiniScreen3Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center, contentScale = ContentScale.Fit
    )
    Column(modifier = Modifier .fillMaxSize()) {
      Column(
          modifier = Modifier
              .fillMaxWidth()
              .weight(0.6f)
              . padding(bottom = 20.dp),
          horizontalAlignment = Alignment.Start
      ) {
          ImageAsincComponent(data, estilosImagen)
      }
      Column(
          modifier = Modifier
              .fillMaxWidth(
              )
              .weight(0.4f)
              .background(Color(0xFF32627E))
      ) {}
  }
}