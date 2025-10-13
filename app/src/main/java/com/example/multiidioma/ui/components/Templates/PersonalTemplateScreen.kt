package com.example.multiidioma.ui.components.Templates

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.PersonalResearcher
import com.example.multiidioma.ui.theme.robotoFamily
import com.example.multiidioma.utils.TemplateCircleScreenUtils.ArrowImageUtil
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextDisplayMedium
import com.example.multiidioma.utils.TextTitleMedium

@Composable
    fun PersonalTemplateScreen(
    //data: MiniScreenData,
    infoResearchers: PersonalResearcher,
    navController: NavController,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.15f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier

                    .size(48.dp) //  área clickeable si quieres
                    .clickable { navController.popBackStack() }
            ) {
                ArrowImageUtil(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
        // Contenido principal
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f),
                contentAlignment = Alignment.Center
            ) {
                // Imagen principal si existe
                Image(
                    painter = painterResource(infoResearchers.foto),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp))

            }
            // Título Medium
            if (infoResearchers.name != null) {
                //TextTitleMedium(infoResearchers.name, index = 0)
                Text(text= infoResearchers.name)
            }
            /*if (data.bodyParagraphs.size > 0) {
                TextTitleMedium(data, index = 0)
            }*/
            Spacer(modifier = Modifier.height(6.dp))

            // Título Small
            if (infoResearchers.info[0] != null) {
                //TextDisplayMedium(data, index = 1)
                infoResearchers.info[0]?.let { stringId ->
                    Text(text = stringResource(id = stringId))
                } ?: Text(text = "Cargo no disponible")
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Body Medium
            Column {
                infoResearchers.info.forEachIndexed { index, stringId ->
                    if (index > 1 && (index != infoResearchers.info.lastIndex - 1)) { // omite los índices 0 y 1
                        stringId?.let {
                            Text(text = stringResource(id = it))
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f)
                    .padding(top = 15.dp, bottom = 15.dp)
            ) {
                val context = LocalContext.current
                val lastItem = infoResearchers.info.lastOrNull()
                val destination = lastItem?.let { id -> stringResource(id = id) }

                TextButton(
                    onClick = {
                        destination?.let {
                            if (it.startsWith("http")) {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it))
                                context.startActivity(intent)
                            } else {
                                navController.navigate(it)
                            }
                        }
                    },
                    contentPadding = PaddingValues(0.dp),
                ) {
                    Text(
                        text = stringResource(R.string.MORE_INFO),
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Black
                    )
                }
            }
        }
    }
}