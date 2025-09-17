package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.R

@Composable
fun BackWithArrowButtonCircleTemplate(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Flecha
        ArrowImageUtil(
            modifier = Modifier.size(24.dp) // ajusta tamaño de la flecha
        )

        Spacer(modifier = Modifier.width(8.dp)) // separación entre flecha y texto

        // Texto que actúa como botón
        TextButton(
            onClick = { navController.popBackStack() },
            contentPadding = PaddingValues(0.dp), // elimina padding por defecto
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                text = stringResource(R.string.back_arrow),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}
