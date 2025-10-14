import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.LottieScrollWithOffsetComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIpsiusMiniScreen16Box2(
    data: MiniScreenData, listState: LazyListState,
    itemIndex: Int,
) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),

        contentScale = ContentScale.Fit
    )

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(horizontal = 50.dp),

            contentAlignment = Alignment.TopStart
        ) {
            Column {
                TextBodyMedium(data, textAlign = TextAlign.Start, index = 0)
                SpacerText()
                TextBodyMedium(data, textAlign = TextAlign.Start, index = 1)
            }
        }

        SpacerText()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),

            contentAlignment = Alignment.Center
        ) {
            LottieScrollWithOffsetComponent(
                debuxoLottie = R.raw.ipsius_anim_05,
                listState = listState,
                itemIndex = itemIndex,


                )
        }
    }
}
