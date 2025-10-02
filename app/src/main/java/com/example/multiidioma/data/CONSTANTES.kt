package com.example.multiidioma.data

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.media3.extractor.text.webvtt.WebvttCssStyle.FontSizeUnit
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

val CorBottomAndTop = Color(0xFF32627E)

val darkBlue = Color(0xFF32627E)
val accentColor = Color(0xFF00BCD4) // Un cian claro
val corLetras = Color(0xFF66aad1)
val whiteColor = Color.White

val nomeInstitutos = listOf("IHUS", "IDEGA", "ICE", "INCIFOR", "IMATUS", "ILG","IPSIUS")
val nomeCentros = listOf("CIQUS", "CIMUS", "CITIUS", "CRETUS", "IGFAE", "IDIS")

data class BOX(
    val Box1: Float,
    val Box2: Float,
    val Box3: Float
)

val valoresTemplateScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)

data class TitulosEnlaces(
    val titulosModalDrawSheet : List<@Composable ()-> Unit>
)
class listaTitulos{
    fun CentrosSingulares ( navController : NavHostController,scope: CoroutineScope , drawerState: DrawerState) :
            TitulosEnlaces {
        return TitulosEnlaces(listOf
            (
            {Text(text = "CENTROS SINGULARES", modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight. W800)},
            {Text(
                text = "CIQUS",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        navController.navigate(Destination.Ciqus.route)
                        scope.launch { drawerState.close() }

                    }
            )},
            {Text(
                text = "CITIUS",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        navController.navigate(Destination.Citius.route)
                        scope.launch { drawerState.close() }

                    }
            )},
            {Text(
                text = "CRETUS",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        navController.navigate(Destination.Cretus.route)
                        scope.launch { drawerState.close() }

                    }
            )},
            {
                Text(
                    text = "IGFAE",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Igfae.route)
                            scope.launch { drawerState.close() }

                        }
                )
            }
        )
        )
    }
    fun Institutos ( navController : NavHostController,scope: CoroutineScope , drawerState: DrawerState) :
            TitulosEnlaces {
        return TitulosEnlaces(listOf
            (
                {Text(
                    text = "INSTITUTOS DE INVESTIGACIÓN",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight. W800
                )},
                {Text(
                    text = "IHUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Ihus.route)
                            scope.launch { drawerState.close() }

                        }
                )},
                {Text(
                    text = "IDEGA",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Idega.route)
                            scope.launch { drawerState.close() }

                        }
                )},
                {Text(
                    text = "ICE",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Ice.route)
                            scope.launch { drawerState.close() }

                        }
                )},
                {Text(
                    text = "INCIFOR",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Incifor.route)
                            scope.launch { drawerState.close() }

                        }
                )
                },
                {Text(
                    text = "IMATUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Imatus.route)
                            scope.launch { drawerState.close() }

                        }
                )},
                {Text(
                    text = "ILG",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Ilg.route)
                            scope.launch { drawerState.close() }

                        }
                )},
                {Text(
                    text = "IPSIUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Ipsius.route)
                            scope.launch { drawerState.close() }

                        }
                )}
            )
        )
    }
}
