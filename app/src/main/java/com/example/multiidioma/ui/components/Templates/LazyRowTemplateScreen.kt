package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.LazyRowComponent
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.utils.LazyRowTemplateScreenUtils.DirectiveTeamUtil


/*
@Composable
fun LazyRowTemplateScreen(
    navController: NavController,
    podcasts: List<Podcast>,
    data: MiniScreenData,
    FirstDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    FirstDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveImage: @Composable (MiniScreenData) -> Unit = {},
    SecondDirectiveDescriptionText: @Composable (MiniScreenData) -> Unit = {},
    modifier: Modifier = Modifier
)
* */


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
        DirectiveTeamUtil(
            data,
            elementosLazyRowTemplate.infoWorkerCenter[0],//FirstDirectiveImage,
            elementosLazyRowTemplate.infoWorkerCenter[1],//FirstDirectiveDescriptionText,
            elementosLazyRowTemplate.infoWorkerCenter[2],//SecondDirectiveImage,
            elementosLazyRowTemplate.infoWorkerCenter[3],//SecondDirectiveDescriptionText,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        )
/*
        // Equipo Directivo
        DirectiveTeamUtil(
            data,
            FirstDirectiveImage,
            FirstDirectiveDescriptionText,
            SecondDirectiveImage,
            SecondDirectiveDescriptionText,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        )
*/
        // LazyRow
        LazyRowComponent(
            podcasts = elementosLazyRowTemplate.podcast,
            destination = Destination.Incifor,
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
        )

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
