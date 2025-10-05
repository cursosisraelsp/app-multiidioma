package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R

@Composable
fun ArrowImageUtil(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.incifor_img_36),
        contentDescription = stringResource(R.string.back_arrow),
        contentScale = ContentScale.Fit,
        modifier = modifier
            .height(24.dp)
            .aspectRatio(1f) // mantiene proporción cuadrada
    )
}