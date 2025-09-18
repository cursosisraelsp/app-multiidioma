package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.utils.TemplateCircleScreenUtils.ArrowImageUtil
import com.example.multiidioma.R

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun PersonalTemplateScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .background(Color.Red)
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.15f)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp) //  área clickeable si quieres
                    .clickable { navController.popBackStack() }
            ) {
                ArrowImageUtil(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
        ) {
            Image(painter = painterResource(R.drawable.noimagen), contentDescription = "")
        }

        Text(
            text = "Nombre de Ejemplo de Personal de Investigacion",
            fontSize = 24.sp
        )
        Text(
            text = "Apellidos de Ejemplo de Personal de Investigacion",
            fontSize = 20.sp
        )
        Text(
            text = "Posicion de Ejemplo de Personal de Investigacion",
            fontSize = 18.sp
        )
    }

    Text(
        text = " Texto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemploTexto de ejemplo ",
        fontSize = 14.sp
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.15f)
    ) {
        TextButton(
            onClick = { navController.popBackStack() },
            contentPadding = PaddingValues(0.dp),
        ) {
            Text(
                text = "MAS INFO",
                fontSize = 24.sp
            )
        }


    }
}