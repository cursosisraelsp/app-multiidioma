package com.example.multiidioma.utils.LazyRowTemplateScreenUtils



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData

@Composable
fun DirectiveTeamUtil(
    data: MiniScreenData,
    FirstDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    FirstDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.Directive_Team),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                color = Color.Black, modifier = Modifier
                    .padding(bottom = 10.dp)
            )
        }

        // Directivos
        Directives(
            data,
            FirstDirectiveImage,
            FirstDirectiveDescriptionText,
            SecondDirectiveImage,
            SecondDirectiveDescriptionText
        )

    }
}