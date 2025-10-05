package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LazyRowComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.utils.LazyRowTemplateScreenUtils.DirectiveTeamUtil





@Composable
fun LazyRowTemplateScreen(
    navController: NavController,
    data: MiniScreenData,
    elementosLazyRowTemplate : WorkersCenter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {

        // Línea superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.1f)
        ) {
            LineVerticalComponent(
                modifier = Modifier.fillMaxHeight(),
            )
        }

        // Directiva
        DirectiveTeamUtil(
            data,
            elementosLazyRowTemplate.infoWorkerCenter[0],
            elementosLazyRowTemplate.infoWorkerCenter[1],
            elementosLazyRowTemplate.infoWorkerCenter[2],
            elementosLazyRowTemplate.infoWorkerCenter[3],
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        )

        // Título RESEARCH STAFF
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = stringResource(R.string.Research_Staff),
                textAlign = TextAlign.Start,
                fontSize = 25.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 20.dp, start = 16.dp)
            )
        }

        // LazyRow clickeable temporalmente
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
                .clickable {
                    // 🚀 Ir a la pantalla de prueba
                    navController.navigate("pantallaPrueba")
                }
        ) {
            LazyRowComponent(
                podcasts = elementosLazyRowTemplate.podcast,
                destination = Destination.Incifor,
                navController = navController,
                modifier = Modifier.fillMaxSize()
            )
        }

        // Línea inferior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.1f)
        ) {
            LineVerticalComponent(
                modifier = Modifier.fillMaxHeight(),
            )
        }
    }
}