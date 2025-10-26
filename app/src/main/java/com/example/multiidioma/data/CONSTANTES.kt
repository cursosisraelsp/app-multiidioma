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
import androidx.navigation.NavHostController
import com.example.multiidioma.data.types.Podcast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

val CorBottomAndTop = Color(0xFF32627E)

val darkBlue = Color(0xFF32627E)
val accentColor = Color(0xFF00BCD4) // Un cian claro
val whiteColor = Color.White
val corLetras = Color(0xFF66aad1)

val nomeInstitutos = listOf("IHUS", "IDEGA", "ICE", "INCIFOR", "IMATUS", "ILG","IPSIUS","IARCUS")
val nomeCentros = listOf("CIQUS", "CIMUS", "CITIUS", "CRETUS", "IGFAE", "IDIS")

val urlIncifor =
    "https://www.usc.gal/gl/investigar-na-usc/investigar/institutos-centros-investigacion/institutos/INCIFOR"
val urlCitius = "https://citius.gal/es/ "
val urlIpsius = ""
val urlImatus = "https://investigacion.usc.gal/investigadores/60527/detalle"
val urlIce = ""
val urlCimus = ""
val urlIhus = "https://www.usc.gal/es/node/49934"
val urlIlg = "https://www.usc.gal/es/node/49934"
val urlIdis = "https://www.idisantiago.es/"
val urlCretus = "https://cretus.usc.es/"
val urlIarcus = "https://arcus.usc.es/"
val urlIgfae = "https://igfae.usc.es/igfae/"
val urlCiqus = " https://www.usc.es/ciqus/es"
// RECURSOS IMAXES
val imaxesWEBP = "EN_WEBP"
val imaxesJPG = "EN_JPG"
val urlRecursosApp = "https://raw.githubusercontent.com/cursosisraelsp/recursos-app-obradoiro-santiago-2025/main"
val centrosInstitutos = listOf("cimus","ciqus","citius","cretus","iarcus","ice","idis","igfae","ihus","ilga","imatus","incifor","raw")
val centroCimus = centrosInstitutos[0]
val centroCiqus = centrosInstitutos[1]
val centroCitius = centrosInstitutos[2]
val centroCretus = centrosInstitutos[3]
val centroIarcus = centrosInstitutos[4]
val centroIce = centrosInstitutos[5]
val centroIdis = centrosInstitutos[6]
val centroIgfae = centrosInstitutos[7]
val centroIhus = centrosInstitutos[8]
val centroIlga = centrosInstitutos[9]
val centroImatus = centrosInstitutos[10]
val centroIncifor = centrosInstitutos[11]
val centroRaw = centrosInstitutos[12]

// URLS MULTIMEDIA
val urlIvoox = "https://go.ivoox.com/rf"
val urlVimeo = "https://vimeo.com/"
data class BOX(
    val Box1: Float,
    val Box2: Float,
    val Box3: Float
)

val valoresTemplateScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)


data class TitulosEnlaces(
    val titulosModalDrawSheet: List<@Composable () -> Unit>
)

class listaTitulos {
    fun CentrosSingulares(
        navController: NavHostController,
        scope: CoroutineScope,
        drawerState: DrawerState
    ):
            TitulosEnlaces {
        return TitulosEnlaces(
            listOf
            (
            {
                Text(
                    text = "CENTROS SINGULARES", modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.W800
                )
            },
            {
                Text(
                    text = "CIQUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Ciqus.route)
                            scope.launch { drawerState.close() }
                            val urlIncifor =
                                "https://www.usc.gal/gl/investigar-na-usc/investigar/institutos-centros-investigacion/institutos/INCIFOR"
                            val urlCitius = "https://citius.gal/es/ "
                            val urlIpsius = ""
                            val urlImatus =
                                "https://investigacion.usc.gal/investigadores/60527/detalle"
                            val urlIce = ""
                            val urlCimus = ""

                            data class BOX(
                                val Box1: Float,
                                val Box2: Float,
                                val Box3: Float
                            )

                            val valoresTemplateScreen = BOX(Box1 = 0.1f, Box2 = 0.33f, Box3 = 0.33f)


                        }
                )
            },
            {
                Text(
                    text = "CITIUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Citius.route)
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "CRETUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate(Destination.Cretus.route)
                            scope.launch { drawerState.close() }

                        }
                )
            },
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

    fun Institutos(
        navController: NavHostController,
        scope: CoroutineScope,
        drawerState: DrawerState
    ):
            TitulosEnlaces {
        return TitulosEnlaces(
            listOf
            (
            {
                Text(
                    text = "INSTITUTOS DE INVESTIGACIÓN",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.W800
                )
            },
            {
                Text(
                    text = "IHUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Ihus.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "IDEGA",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Idega.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "ICE",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Ice.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "INCIFOR",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Incifor.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "IMATUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Imatus.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "ILG",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Ilg.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            },
            {
                Text(
                    text = "IPSIUS",
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("${Destination.Ipsius.route}?resetScroll=true")
                            scope.launch { drawerState.close() }

                        }
                )
            }
        )
        )
    }
}