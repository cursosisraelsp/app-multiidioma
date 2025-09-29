package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen2.contentIlgMiniScreen2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.data.StyleImages
import com.example.multiidioma.data.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.utils.SvgImageComponent


@Composable
fun contentIlgMiniScreen2Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.Center
    )
    val estilosTextos =
        StyleText(
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.End,
        )

    Column {
        Column(
            modifier = Modifier
                .fillMaxSize()
            /*.padding(start = 20.dp, end = 20.dp)*/
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.45f)
                    .padding(start = 20.dp, end = 25.dp )
            ) {
                AppText(data, estilosTextos, index = 0)

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.45f)
                    .padding(start = 20.dp, end = 25.dp)
            ) {
                AppText(data, estilosTextos, index = 1)
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.3f)
                    .padding(start = 260.dp)
            )
            {
                SvgImageComponent(R.raw.logo_ilga_0,
                    )
                //ReusableImage(data, estilosImagen)
            }
        }
    }
}