import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIpsiusMiniScreen16Box2(data: MiniScreenData) {
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
                TextBodyMedium(data, textAlign = TextAlign.Start,index= 0)
                SpacerText()
                TextBodyMedium(data, textAlign = TextAlign.Start, index= 1)
            }
        }

        SpacerText()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),

            contentAlignment = Alignment.Center
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}
