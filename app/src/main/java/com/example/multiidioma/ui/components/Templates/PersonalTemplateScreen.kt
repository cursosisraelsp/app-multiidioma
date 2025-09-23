package com.example.multiidioma.ui.components.Templates

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TemplateCircleScreenUtils.ArrowImageUtil

@Composable
fun PersonalTemplateScreen(
    data: MiniScreenData,
    navController: NavController,
    PersonalPosition: @Composable (MiniScreenData) -> Unit = {},
    PersonalNameText: @Composable (MiniScreenData) -> Unit = {},
    PersonalImage: @Composable (MiniScreenData) -> Unit = {},
    PersonalText: @Composable (MiniScreenData) -> Unit = {}
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

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            PersonalImage(data)
        }

        PersonalNameText(data)

        PersonalPosition(data)

        PersonalText(data)

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
                    fontSize = 24.sp
                )
            }
        }
    }
}