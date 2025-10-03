package com.example.multiidioma.ui.screens.institutes.ilg

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen10.IlgMiniScreen10
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen11.IlgMiniScreen11
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen12.IlgMiniScreen12
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen3.IlgMiniScreen3
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen4.IlgMiniScreen4
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen5.IlgMiniScreen5
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen6.IlgMiniScreen6
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen7.IlgMiniScreen7
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen8.IlgMiniScreen8
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen9.IlgMiniScreen9
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen0.ilgMiniScreen0
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen1.ilgMiniScreen1
import com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.ilgMiniScreen2.IlgMiniScreen2


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun IlgScreen(
    listState: LazyListState,
    navController: NavController
) {
    val viewModel: IlgViewModel = viewModel()
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
                items(screens) { data ->
                    when (data.id) {
                        0 -> ilgMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> ilgMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> IlgMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> IlgMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> IlgMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> IlgMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> IlgMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                            )
                        7 -> IlgMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                         8 -> IlgMiniScreen8(
                             data,
                             Modifier
                                 .fillMaxWidth()
                                 .fillParentMaxHeight(),
                             navController
                        )
                        9 -> IlgMiniScreen9(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> IlgMiniScreen10(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> IlgMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> IlgMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        /*13 -> IlgMiniScreen13(

                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )


                        14 -> IlgMiniScreen14(
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
