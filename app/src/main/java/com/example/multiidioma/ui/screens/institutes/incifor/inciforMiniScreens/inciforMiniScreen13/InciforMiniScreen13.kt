package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen13.contentInciforMiniScreen13Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen13.contentInciforMiniScreen13Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen13.contentInciforMiniScreen13Box3
import com.example.multiidioma.utils.SvgImageUtils
import androidx.navigation.NavHostController
import com.example.multiidioma.data.Destination

@Composable
fun InciforMiniScreen13(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
    //navController: NavHostController
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(modifier = Modifier
            .offset(x=50.dp,y=20.dp), contentAlignment = Alignment.Center){
            SvgImageUtils(
                resId = R.raw.circulo_blanco,
                modifier = Modifier.size(150.dp).clickable {
                   // navController.navigate(Destination.Cretus.route)
                }
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text("03")
                Text("este texto en Incifor")
            }

        }
        Box(modifier = Modifier
            .offset(x=260.dp,y=70.dp), contentAlignment = Alignment.Center){
            SvgImageUtils(
                resId = R.raw.circulo_blanco,
                modifier = Modifier.size(150.dp).clickable {

                }
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text("03")
                Text("este texto en Incifor")
            }

        }
        Box(modifier = Modifier
            .offset(x=50.dp,y=460.dp), contentAlignment = Alignment.Center){
            SvgImageUtils(
                resId = R.raw.circulo_blanco,
                modifier = Modifier.size(150.dp)
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text("03")
                Text("este texto en Incifor")
            }

        }
        Box(modifier = Modifier
            .offset(x=240.dp,y=470.dp), contentAlignment = Alignment.Center){
            SvgImageUtils(
                resId = R.raw.circulo_blanco,
                modifier = Modifier.size(150.dp)
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text("03")
                Text("este texto en Incifor")
            }

        }
        Box(modifier = Modifier
            .offset(x=80.dp,y=175.dp), contentAlignment = Alignment.Center){
            SvgImageUtils(
                resId = R.raw.circulo_blanco,
                modifier = Modifier.size(300.dp)
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text("03")
                Text("este texto en Incifor")
            }

        }

    }
}
