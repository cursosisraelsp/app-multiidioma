package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.theme.robotoFamily
import com.example.multiidioma.utils.TemplateCircleScreenUtils.ArrowImageUtil
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextDisplayMedium
import com.example.multiidioma.utils.TextTitleMedium

@Composable
fun PersonalTemplateScreen(
    data: MiniScreenData,
    navController: NavController,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.15f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier

                    .size(48.dp) //  área clickeable si quieres
                    .clickable { navController.popBackStack() }
            ) {
                ArrowImageUtil(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }

        // Contenido principal
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f),
                contentAlignment = Alignment.Center
            ) {
                // Imagen principal si existe
                data.imageRes?.let { res ->
                    Image(
                        painter = painterResource(res),
                        contentDescription = null,
                        modifier = Modifier.size(200.dp)
                    )
                }
            }
            // Título Medium
            if (data.bodyParagraphs.size > 0) {
                TextTitleMedium(data, index = 0)
            }
            Spacer(modifier = Modifier.height(6.dp))

            // Título Small
            if (data.bodyParagraphs.size > 1) {
                TextDisplayMedium(data, index = 1)
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Body Medium
            if (data.bodyParagraphs.size > 2) {
                TextBodyMedium(data, index = 2)
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f)
                    .padding(top = 15.dp, bottom = 15.dp)
            ) {
                TextButton(
                    onClick = {},
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Text(
                        text = stringResource(R.string.MORE_INFO),
                        fontFamily = robotoFamily,
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }
            }
        }
    }
}