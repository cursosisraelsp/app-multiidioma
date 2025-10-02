package com.example.multiidioma.ui.components.Templates

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.utils.TextBodyMedium
import androidx.core.net.toUri
import com.example.multiidioma.ui.theme.robotoFamily
import com.example.multiidioma.R
import com.example.multiidioma.ui.LocalizedContext

@Composable
fun ScrollingEndScreenTemplate(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    buttonTextIndex: Int = 1,
    buttonLink: String
) {
    val androidContext = LocalContext.current
    val localizedContext = LocalizedContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
            .padding(horizontal = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Línea vertical
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
        ) {
            LineCircleComponent()
        }

        // Bloque texto con botón
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.7f),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Texto principal
                TextBodyMedium(
                    data, index = 0, textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Botón
                Button(
                    onClick = {
                        val intent = Intent(Intent.ACTION_VIEW, buttonLink.toUri())
                        androidContext.startActivity(intent)   //  este sigue con el de Android
                    },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF18325)),
                    modifier = Modifier
                ) {
                    Text(
                        text = runCatching { localizedContext.getString(data.bodyParagraphs[buttonTextIndex]) }
                            .getOrElse { "???" },
                        fontFamily = robotoFamily,
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}