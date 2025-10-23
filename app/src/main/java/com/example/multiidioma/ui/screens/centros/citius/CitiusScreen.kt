package com.example.multiidioma.ui.screens.centros.citius

/*import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen17.CitiusMiniScreen17*/
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen0.CitiusMiniScreen0
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen1.CitiusMiniScreen1
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11.CitiusMiniScreen11
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen12.CitiusMiniScreen12
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen13.CitiusMiniScreen13
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen14.CitiusMiniScreen14
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.CitiusMiniScreen15
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.CitiusMiniScreen16
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen2.CitiusMiniScreen2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.CitiusMiniScreen3
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen4.CitiusMiniScreen4
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen5.CitiusMiniScreen5


@Composable
fun CitiusScreen(
    listState: LazyListState,
    navController: NavController
) {
    val viewModel: CitiusViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is MiniScreenState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is MiniScreenState.Success -> {
            val screens = (uiState as MiniScreenState.Success).screens
            LaunchedEffect(Unit) {
                listState.scrollToItem(0)
            }
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(screens) { index, data ->
                    when (data.id) {

                        0 -> CitiusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        1 -> CitiusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> CitiusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> CitiusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> CitiusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        5 -> CitiusMiniScreen5(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> CitiusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> CitiusMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> CitiusMiniScreen13(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        14 -> CitiusMiniScreen14(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        15 -> CitiusMiniScreen15(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> CitiusMiniScreen16(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        /*17 -> CitiusMiniScreen17(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )
*/

                        /*18 -> CitiusMiniScreen18(data, navController)*/


                        /*   19 -> CitiusMiniScreen19()
                           20 -> CitiusMiniScreen20()
                           21 -> CitiusMiniScreen21()
                           22 -> CitiusMiniScreen22()
                           23 -> CitiusMiniScreen23()
                           24 -> CitiusMiniScreen24()
                           25 -> CitiusMiniScreen25()*/

                        /*26 -> CitiusMiniScreen26(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )*/

                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }

        is MiniScreenState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = (uiState as MiniScreenState.Error).message,
                    color = Color.Red
                )
            }
        }
    }

}
