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
import com.example.multiidioma.data.repository.podcastsMultimedia
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.incifor.InciforViewModel
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.InciforMiniScreen21
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.InciforMiniScreen0
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.InciforMiniScreen1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.InciforMiniScreen10
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.InciforMiniScreen11
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12.InciforMiniScreen12
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.InciforMiniScreen13
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.InciforMiniScreen14
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.InciforMiniScreen15
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen16.InciforMiniScreen16
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen17.InciforMiniScreen17
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen18.InciforMiniScreen18
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen19.InciforMiniScreen19
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.InciforMiniScreen2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen20.InciforMiniScreen20
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen22.InciforMiniScreen22
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen23.InciforMiniScreen23
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen24.InciforMiniScreen24
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.InciforMiniScreen25
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.InciforMiniScreen3
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.InciforMiniScreen4
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.InciforMiniScreen5
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen6.InciforMiniScreen6
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.InciforMiniScreen7
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.InciforMiniScreen8
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.InciforMiniScreen9
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.InciforMiniScreen26


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun InciforScreen(
    listState: LazyListState,
    navController: NavController,
    modifier: Modifier
) {
    val viewModel: InciforViewModel = viewModel()
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
                modifier = modifier
            ) {
                itemsIndexed(screens) { index,data ->
                    when (data.id) {

                        0 -> InciforMiniScreen0(
                            data,
                            modifier = Modifier.fillParentMaxHeight(),
                            listState = listState, // 👈 Pasamos el scroll global
                            itemIndex = index      // 👈 Para saber en qué posición está
                        )

                        1 -> InciforMiniScreen1(
                            data,
                            modifier = Modifier.fillParentMaxHeight(),
                            listState = listState, // 👈 Pasamos el scroll global
                            itemIndex = index      // 👈 Para saber en qué posición está

                        )

                        2 -> InciforMiniScreen2(
                            data,
                            modifier = Modifier.fillParentMaxHeight(),
                            listState = listState, // 👈 Pasamos el scroll global
                            itemIndex = index      // 👈 Para saber en qué posición está
                        )

                        3 -> InciforMiniScreen3(
                            data,
                            modifier
                            //.fillMaxWidth()
                            //.fillParentMaxHeight()
                        )

                        4 -> InciforMiniScreen4(
                            data,
                            modifier
                            //.fillMaxWidth()
                            //.fillParentMaxHeight()
                        )

                        5 -> InciforMiniScreen5(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> InciforMiniScreen6(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        7 -> InciforMiniScreen7(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> InciforMiniScreen8(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        9 -> InciforMiniScreen9(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> InciforMiniScreen10(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> InciforMiniScreen11(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> InciforMiniScreen12(
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> InciforMiniScreen13(
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight(),
                            navController
                        )

                        14 -> InciforMiniScreen14(
                            navController,
                            data,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        15 -> InciforMiniScreen15(
                            data,
                            navController,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> InciforMiniScreen16(
                            data,
                            navController,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        17 -> InciforMiniScreen17(
                            data,
                            navController,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        18 -> InciforMiniScreen18(
                            data,
                            navController,
                            modifier
                                //.fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        19 -> InciforMiniScreen19(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        20 -> InciforMiniScreen20(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        21 -> InciforMiniScreen21(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        22 -> InciforMiniScreen22(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        23 -> InciforMiniScreen23(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        24 -> InciforMiniScreen24(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        25 -> InciforMiniScreen25(
                            data,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        26 -> InciforMiniScreen26(
                            data,
                            navController,
                            podcastsMultimedia,
                            modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }

        is MiniScreenState.Error -> {
            Box(
                modifier = modifier.fillMaxSize(),
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


