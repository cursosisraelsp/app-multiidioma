package com.example.multiidioma.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R


// Define el proveedor de la fuente
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Define las fuentes que usarás
val bodyFontFamily = GoogleFont(name = "Roboto")
val displayFontFamily = GoogleFont(name = "Montserrat")
val titleFontFamily = GoogleFont("Merriweather")

//Definir variables para especificar familias de manera clara
val robotoFamily = FontFamily(
    Font(googleFont = bodyFontFamily, fontProvider = provider)
)
val montserratFamily = FontFamily(
    Font(googleFont = displayFontFamily, fontProvider = provider)
)
val merriweatherFamily = FontFamily(
    Font(googleFont = titleFontFamily, fontProvider = provider)
)

// Configuración de tipografía
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
val AppTypography = Typography(

    bodyMedium = TextStyle(
        fontFamily = robotoFamily,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = merriweatherFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp

    ),
    titleMedium = TextStyle(
        fontFamily = merriweatherFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    titleLarge = TextStyle(
        fontFamily = merriweatherFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),

    displayMedium = TextStyle(
        fontFamily = merriweatherFamily,
        fontStyle = FontStyle.Italic,
        fontSize = 24.sp
    ),
    titleMediumEmphasized = TextStyle(
        fontFamily = merriweatherFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
)


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun MultiidiomaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}