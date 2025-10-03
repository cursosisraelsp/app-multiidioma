package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.contentIlgMiniScreen12

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent


@Composable
fun contentIlgMiniScreen12Box3() {
  Column(modifier = Modifier .fillMaxSize()) {
      Column(
          modifier = Modifier
              .fillMaxWidth()
              .weight(0.55f)
              . padding(bottom = 20.dp),
          horizontalAlignment = Alignment.Start
      ) {
          LineCircleComponent(contentAlignment = Alignment.Center, color = Color.White)
      }
      Column(
          modifier = Modifier
              .fillMaxWidth(
              )
              .weight(0.45f)
              .background(Color(0xFFE5F4F9))
      ) {}
  }
}