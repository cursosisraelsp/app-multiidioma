package com.example.multiidioma.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R

@Composable
fun ParallaxHeader() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    val scrollState = rememberScrollState()
    val imageHeight = 250.dp
    Box {
        // Imagen de cabecera con efecto parallax
        Image(
            painter = painterResource(id = R.drawable.cupcake),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(imageHeight)
                //.size(120.dp)
                .fillMaxWidth()
                .let {
                    // Efecto parallax: la imagen se mueve más lento que el scroll
                    it.graphicsLayer {
                        translationY = scrollState.value * 0.5f
                        translationX = scrollState.value * 0.5f
                        //rotationZ = 15f

                        //rotationZ = 30f
                        //transformOrigin = TransformOrigin(0.5f, 1f) // centro horizontal, borde inferior
                    }
                }
        )

        // Contenido scrolleable, con padding top igual a la altura de la imagen
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .fillMaxWidth()
                .padding(top = imageHeight)
        ) {

            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.White)
                    .padding(16.dp)
            )
            // Puedes agregar más contenido aquí si lo deseas
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.White)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )

            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.White)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text("${scrollState.value}")
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
            )

        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun ParallaxHeaderPreview() {
    ParallaxHeader()
}

*/
/*
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R

@Composable
fun ParallaxEffect() {
    fun Modifier.parallaxLayoutModifier(scrollState: ScrollState, rate: Int) =
        layout { measurable, constraints ->
            val placeable = measurable.measure(constraints)
            val height = if (rate > 0) scrollState.value / rate else scrollState.value
            layout(placeable.width, placeable.height) {
                placeable.place(0, height)
            }
        }

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState),
    ) {

        Image(
            painterResource(id = R.drawable.cupcake),
            contentDescription = "Android logo",

            contentScale = ContentScale.Fit,
            // Reduce scrolling rate by half.
            modifier = Modifier.fillMaxWidth().height(250.dp).parallaxLayoutModifier(scrollState, 2)
        )

        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
        Text(
            text = stringResource(R.string.II_INCIFOR_miniscreen_0_paragraph0),
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 8.dp),

            )
    }
}

*/
// Android y Compose

// Coil


/*
@RequiresApi(Build.VERSION_CODES.P)
@Composable

fun ParallaxComponent() {
    val scrollState = rememberLazyListState()
    val offsetY = remember { derivedStateOf { scrollState.firstVisibleItemScrollOffset * 0.5f } }

    Box {
        // GIF con parallax
        AsyncImage(
            model = R.raw.incifor_anim_01 ,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .graphicsLayer {
                    translationY = offsetY.value.toFloat()
                }
        )

        // LazyColumn para scroll
        */
/*LazyColumn(
            state = scrollState,
            contentPadding = PaddingValues(top = 250.dp)
        ) {
            items(50) { index ->
                Text(
                    text = "Item $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }*//*

    }
}

*/
