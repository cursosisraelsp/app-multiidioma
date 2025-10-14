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
import androidx.compose.runtime.LaunchedEffect
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
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26.InciforMiniScreen26
/*import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26.InciforMiniScreen26*/
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.InciforMiniScreen0
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.InciforMiniScreen1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.InciforMiniScreen10
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.InciforMiniScreen11
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12.InciforMiniScreen12
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.InciforMiniScreen13
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen19.InciforMiniScreen19
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.InciforMiniScreen2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen20.InciforMiniScreen20
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen21.InciforMiniScreen21
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen22.InciforMiniScreen22
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen23.InciforMiniScreen23
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen24.InciforMiniScreen24
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen25.InciforMiniScreen25
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen28.InciforMiniScreen50
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.InciforMiniScreen3
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.InciforMiniScreen4
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.InciforMiniScreen5
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen6.InciforMiniScreen6
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.InciforMiniScreen7
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.InciforMiniScreen8
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.InciforMiniScreen9


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun InciforScreen(
    listState: LazyListState,
    navController: NavController,
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
            LaunchedEffect(Unit) {
                listState.scrollToItem(0)
            }
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(screens) { index, data ->
                    when (data.id) {

                        0 -> InciforMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        1 -> InciforMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        2 -> InciforMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> InciforMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> InciforMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> InciforMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> InciforMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        7 -> InciforMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        8 -> InciforMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        9 -> InciforMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index

                        )

                        10 -> InciforMiniScreen10(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> InciforMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index

                        )

                        12 -> InciforMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> InciforMiniScreen13(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        19 -> InciforMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        20 -> InciforMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        21 -> InciforMiniScreen21(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        22 -> InciforMiniScreen22(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        23 -> InciforMiniScreen23(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        24 -> InciforMiniScreen24(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        25 -> InciforMiniScreen25(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        26 -> InciforMiniScreen26(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        50 -> InciforMiniScreen50(
                            data,
                            Modifier
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


