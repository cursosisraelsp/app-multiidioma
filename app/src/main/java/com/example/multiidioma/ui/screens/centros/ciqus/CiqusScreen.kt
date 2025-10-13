package com.example.multiidioma.ui.screens.centros.ciqus

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.data.podcastsMultimedia
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.centros.idis.IdisViewModel
import com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen17.IdisMiniScreen17
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen4.CiqusMiniScreen4
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen5.CiqusMiniScreen5
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen6.CiqusMiniScreen6
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.CiqusMiniScreen7.CiqusMiniScreen7
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen0.ciqusMiniScreen0
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen1.ciqusMiniScreen1
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen10.ciqusMiniScreen10
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen11.ciqusMiniScreen11
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen2.ciqusMiniScreen2
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen3.ciqusMiniScreen3
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen8.ciqusMiniScreen8
import com.example.multiidioma.ui.screens.ciqus.ciqusMiniScreens.ciqusMiniScreen9.ciqusMiniScreen9
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen10.IdisMiniScreen10
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen11.IdisMiniScreen11
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen3.IdisMiniScreen3
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen4.IdisMiniScreen4
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen5.IdisMiniScreen5
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen6.IdisMiniScreen6
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen7.IdisMiniScreen7
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen8.IdisMiniScreen8
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.IdisMiniScreen9.IdisMiniScreen9
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen0.idisMiniScreen0
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen1.idisMiniScreen1
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen12.IdisMiniScreen12
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen13.IdisMiniScreen13
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen14.IdisMiniScreen14
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen15.IdisMiniScreen15
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen16.IdisMiniScreen16
import com.example.multiidioma.ui.screens.idis.idisMiniScreens.idisMiniScreen2.idisMiniScreen2

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun CiqusScreen(
    listState: LazyListState,
    navController: NavController
) {
    val viewModel: CiqusViewModel = viewModel()
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
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(screens) { index, data ->
                    when (data.id) {
                        0 -> ciqusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> ciqusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> ciqusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> ciqusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                       4 -> CiqusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            navController
                        )

                        5 -> CiqusMiniScreen5(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> CiqusMiniScreen6(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        7 -> CiqusMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> ciqusMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState =  listState,
                            itemIndex = index
                        )

                        9 -> ciqusMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState =  listState,
                            itemIndex = index
                        )

                       10 -> ciqusMiniScreen10(
                        data,
                        Modifier
                            .fillMaxWidth()
                            .fillParentMaxHeight(),
                        listState =  listState,
                        itemIndex = index
                        )

                        11 -> ciqusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState =  listState,
                            itemIndex = index
                        )

                       /* 12 -> IdisMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> IdisMiniScreen13(

                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )


                        14 -> IdisMiniScreen14(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        15 -> IdisMiniScreen15(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> IdisMiniScreen16(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        17 -> IdisMiniScreen17(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
*/
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