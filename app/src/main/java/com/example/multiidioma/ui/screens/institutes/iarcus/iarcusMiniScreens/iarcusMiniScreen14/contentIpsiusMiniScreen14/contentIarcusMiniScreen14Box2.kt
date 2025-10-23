package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen14.contentIpsiusMiniScreen14






import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText


@Composable
fun contentIarcusMiniScreen14Box2(data: MiniScreenData,listState: LazyListState,
                                  itemIndex: Int,) {
    val estiloTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        color = Color(0xFF000000),
        textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 30.dp),
        alignment = Alignment.Center
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp, bottom = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppText(data, estiloTextos, index = 0)
            SpacerText()
            AppText(data, estiloTextos, index = 1)
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           // LottieScrollWithOffsetComponent(
              //  debuxoLottie = R.raw.iarcus_anim_02,
              //  listState = listState,
              //  itemIndex = itemIndex,
               // modifier = Modifier.align(Alignment.CenterHorizontally),

              //  )
        }
    }
}