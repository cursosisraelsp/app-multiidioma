package com.example.multiidioma.utils.TemplateCircleScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.multiidioma.R

@Composable
fun BackButtonCircleTemplateUtil(
    modifier: Modifier,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        TextButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                text = stringResource(R.string.atras),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}