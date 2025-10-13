package com.example.multiidioma.ui.components.Templates


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast


@Composable
fun LazyRowNoClickScreenTemplate(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    val investigadores = data.personalResearcher ?: emptyList()

    // Separar Directora y Secretaria
    val principales = investigadores.filter {
        it.name == "Ana María Bermejo Barrera" || it.name == "Inés Sánchez Sellero"
    }

    // Resto de investigadores
    val resto = investigadores.filter { it !in principales }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
            /*.background(Color.Red)*/
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(principales) { investigador ->
                    Column(
                        modifier = Modifier
                            .height(300.dp) //tamaño cuadrado del personal alto
                            .width(250.dp)  //tamaño cuadrado del personal ancho
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Yellow)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(investigador.foto),
                            contentDescription = investigador.name ?: "Sin nombre",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp) //alto imagen
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(text = investigador.name ?: "Sin nombre", color = Color.White)
                        investigador.info?.forEach { resId ->
                            resId?.let { Text(text = stringResource(it), color = Color.LightGray) }
                        }
                    }
                }
            }
        }

        // Parte inferior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
            /*.background(Color.Green)*/
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(resto) { investigador ->
                    Column(
                        modifier = Modifier
                            .height(325.dp)// alto tarjeta investigadores
                            .width(225.dp) // ancho tarjeta investigadores
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.DarkGray)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(investigador.foto),
                            contentDescription = investigador.name ?: "Sin nombre",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(125.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(text = investigador.name ?: "Sin nombre", color = Color.White)
                        investigador.info?.forEach { resId ->
                            resId?.let { Text(text = stringResource(it), color = Color.LightGray) }
                        }
                    }
                }
            }
        }
    }
}
