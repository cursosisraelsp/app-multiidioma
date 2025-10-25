package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.MaterialTheme
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
    centerName: String,
    director1: String,
    director2: String? = null,
    modifier: Modifier = Modifier,
) {
    val investigadores = data.personalResearcher ?: emptyList()

    // Separar directora/os
    val principales = investigadores.filter {
        it.name == director1 || it.name == director2
    }

    // Resto de investigadores
    val resto = investigadores.filter { it !in principales }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {

        // 🔹 Directores (fila superior)
        Box(modifier = Modifier.fillMaxWidth()) {
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
                            .height(300.dp)
                            .width(250.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .padding(8.dp)
                    ) {
                        // Imagen
                        Image(
                            painter = painterResource(investigador.foto),
                            contentDescription = investigador.name ?: "Sin nombre",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )

                        Spacer(Modifier.height(8.dp))

                        // Nombre
                        Text(
                            text = investigador.name ?: "Sin nombre",
                            color = Color.White,
                            style = MaterialTheme.typography.titleSmall
                        )

                        // Cargo (role) si existe
                        investigador.role?.let { roleRes ->
                            Text(
                                text = stringResource(id = roleRes),
                                color = Color.White,
                                style = MaterialTheme.typography.displaySmall
                            )
                        }

                        // Título (title) si existe
                        investigador.title?.let { titleRes ->
                            Text(
                                text = stringResource(id = titleRes),
                                color = Color.White,
                                style = MaterialTheme.typography.displaySmall
                            )
                        }
                    }
                }
            }
        }

        // 🔹 Resto de investigadores (fila inferior)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
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
                            .height(325.dp)
                            .width(225.dp)
                            .clip(RoundedCornerShape(8.dp))

                            .clickable {
                                val ruta = "detalles/${centerName}/${investigador.name}" // o id si lo tienes
                                navController.navigate(ruta)
                            }
                            .padding(8.dp)
                    ) {
                        // Imagen
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

                        // Nombre
                        Text(
                            text = investigador.name ?: "Sin nombre",
                            color = Color.White,
                            style = MaterialTheme.typography.titleSmall
                        )

                        // Cargo (role) si existe
                        investigador.role?.let { roleRes ->
                            Text(
                                text = stringResource(id = roleRes),
                                color = Color.White,
                                style = MaterialTheme.typography.displaySmall
                            )
                        }

                        // Título (title) si existe
                        investigador.title?.let { titleRes ->
                            Text(
                                text = stringResource(id = titleRes),
                                color = Color.White,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }
    }
}