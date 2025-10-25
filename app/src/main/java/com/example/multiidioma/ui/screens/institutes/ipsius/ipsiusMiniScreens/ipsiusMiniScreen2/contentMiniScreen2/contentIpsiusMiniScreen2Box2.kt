package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen2.contentMiniScreen2


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText


@Composable
fun contentIpsiusMiniScreen2Box2(data: MiniScreenData,listState: LazyListState,
                                 itemIndex: Int,) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val estiloTextos = StyleText(
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.End
            )

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
               // LottieScrollWithOffsetComponent(
                  //  debuxoLottie = R.raw.ipsius_anim_02,
                  //  listState = listState,
                  //  itemIndex = itemIndex,

               // )
            }

            Spacer(modifier = Modifier.height(30.dp))
            AppText(data, estiloTextos)
            SpacerText()
            ReusableImage(
                data,
                StyleImages(
                    modifier = Modifier.size(120.dp),
                    alignment = Alignment.Center
                )
            )
        }
    }
}