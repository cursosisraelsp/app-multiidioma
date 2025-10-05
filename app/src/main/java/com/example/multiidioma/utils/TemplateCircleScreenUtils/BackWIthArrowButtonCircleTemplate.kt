package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.R

@Composable
fun BackWithArrowButtonCircleTemplate(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = { navController.popBackStack() },
        contentPadding = PaddingValues(0.dp),
        modifier = modifier
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            ArrowImageUtil(modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.back_arrow),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}