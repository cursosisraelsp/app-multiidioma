package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen5.contentIpsiusMiniScreen5

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.ui.theme.robotoFamily

@Composable
fun contentIpsiusMiniScreen5Box2(
    data: MiniScreenData,
    buttonTextIndex: Int = 2,
    buttonLink: String,
) {
    val androidContext = LocalContext.current
    val localizedContext = LocalizedContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val estiloTextos = StyleText(
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF000000),
            textAlign = TextAlign.Start
        )

        AppText(data, estiloTextos, index = 0)
        SpacerText()
        AppText(data, estiloTextos, index = 1)

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            contentAlignment = Alignment.Center
        ) {
            val estilosImagen = StyleImages(
                modifier = Modifier.height(200.dp),
                alignment = Alignment.Center
            )
            ReusableImage(data, estilosImagen)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_VIEW, buttonLink.toUri())
                androidContext.startActivity(intent)
            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF18325)),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = runCatching { localizedContext.getString(data.bodyParagraphs[buttonTextIndex]) }
                        .getOrElse { "???" },
                    fontFamily = robotoFamily,
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )


                ReusableImage(
                    data = data,
                    style = StyleImages(
                        modifier = Modifier.height(16.dp),
                        alignment = Alignment.Center
                    )
                )
            }
        }
    }
}
