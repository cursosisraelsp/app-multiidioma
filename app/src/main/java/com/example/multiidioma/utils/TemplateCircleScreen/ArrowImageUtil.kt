package com.example.multiidioma.utils.TemplateCircleScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R

@Composable
fun ArrowImageUtil(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(25.dp),
    ) {
        Image(
            painter = painterResource(R.drawable.incifor_img_36),
            contentScale = ContentScale.FillHeight,
            contentDescription = stringResource(R.string.back_arrow),
            modifier = Modifier
                .fillMaxSize()
        )
    }
}