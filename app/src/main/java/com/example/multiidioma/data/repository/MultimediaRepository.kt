package com.example.multiidioma.data.repository

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.multiidioma.R
import com.example.multiidioma.data.imaxesJPG
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.data.types.VideoVimeo
import com.example.multiidioma.data.types.VideoYoutube
import com.example.multiidioma.data.urlIvoox
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.ClickableImagePodcast
import com.example.multiidioma.ui.components.ImageAsyncVimeo

val porcentaxeBandeira = 0.5f;
val podcastsMultimedia = listOf(
    Podcast(
        id = 1,
        uriSpotifyApp = "spotify:track:3n3Ppam7vgaVa1iaRUc9Lp",
        uriSpotifyWeb = "https://open.spotify.com/track/3n3Ppam7vgaVa1iaRUc9Lp",
        protagonista = "Juanito",
        title = "---",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 2,
        uriSpotifyApp = "spotify:track:5vXPLxljVKyHDHuv3kIuKV",
        uriSpotifyWeb = "https://open.spotify.com/track/5vXPLxljVKyHDHuv3kIuKV",
        protagonista = "Lewis Capaldi",
        title = "Survive",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 3,
        uriSpotifyApp = "spotify:track:7gKxCvTDWwV9wBhdeBbr3l",
        uriSpotifyWeb = "https://open.spotify.com/track/7gKxCvTDWwV9wBhdeBbr3l",
        protagonista = "Olivia Dean",
        title = "Nice to Each Other",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 4,
        uriSpotifyApp = "spotify:track:2dylnPaUPcOvzBLokj8DZa",
        uriSpotifyWeb = "https://open.spotify.com/track/2dylnPaUPcOvzBLokj8DZa",
        protagonista = "Myles Smith",
        title = "Stargazing",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 5,
        uriSpotifyApp = "spotify:track:3n3Ppam7vgaVa1iaRUc9Lp",
        uriSpotifyWeb = "https://open.spotify.com/track/3n3Ppam7vgaVa1iaRUc9Lp",
        protagonista = "Juanito",
        title = "---",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 6,
        uriSpotifyApp = "spotify:track:5vXPLxljVKyHDHuv3kIuKV",
        uriSpotifyWeb = "https://open.spotify.com/track/5vXPLxljVKyHDHuv3kIuKV",
        protagonista = "Lewis Capaldi",
        title = "Survive",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 7,
        uriSpotifyApp = "spotify:track:7gKxCvTDWwV9wBhdeBbr3l",
        uriSpotifyWeb = "https://open.spotify.com/track/7gKxCvTDWwV9wBhdeBbr3l",
        protagonista = "Olivia Dean",
        title = "Nice to Each Other",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    Podcast(
        id = 7,
        uriSpotifyApp = "spotify:track:2dylnPaUPcOvzBLokj8DZa",
        uriSpotifyWeb = "https://open.spotify.com/track/2dylnPaUPcOvzBLokj8DZa",
        protagonista = "Myles Smith",
        title = "Stargazing",
        imaxe = {
            Image(
                painterResource(R.drawable.bgalega),
                contentDescription = "bandeira",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    )
)
val videosMultimedia = listOf(
    VideoYoutube(
        uriYoutube = "https://youtu.be/fRWVeRIcYtE?si=n4WCZgMXI3nyZUUu",
        description = "Miss Monique - Live @ MYSTERYLAND 2025",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    VideoYoutube(
        uriYoutube = "https://www.youtube.com/live/WyP5ThDoeF0?si=m97UskpCeCEboRaR",
        description = "A State of Trance Episode 1219 - Residency Mix by Ferry Corsten",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    VideoYoutube(
        uriYoutube = "https://youtu.be/fRWVeRIcYtE?si=n4WCZgMXI3nyZUUu",
        description = "Miss Monique - Live @ MYSTERYLAND 2025",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    VideoYoutube(
        uriYoutube = "https://youtu.be/fRWVeRIcYtE?si=n4WCZgMXI3nyZUUu",
        description = "Miss Monique - Live @ MYSTERYLAND 2025",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    VideoYoutube(
        uriYoutube = "https://youtu.be/fRWVeRIcYtE?si=n4WCZgMXI3nyZUUu",
        description = "Miss Monique - Live @ MYSTERYLAND 2025",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    ),
    VideoYoutube(
        uriYoutube = "https://youtu.be/fRWVeRIcYtE?si=n4WCZgMXI3nyZUUu",
        description = "Miss Monique - Live @ MYSTERYLAND 2025",
        imaxe = {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "icono",
                modifier = Modifier.fillMaxSize(porcentaxeBandeira)
            )
        }
    )
)

val listaPodcasts = listOf(
    Podcast(
        id = 1,
        uriIvoox = "$urlIvoox/160363725",
        title = "Ondas gravitacionales: entender el universo a través de su violencia",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 2,
        uriIvoox = "$urlIvoox/160372846",
        title = "El radón en Galicia",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 3,
        uriIvoox = "$urlIvoox/160373728",
        title = "Consumo de sustancias en estudiantes: factores explicativos y consecuencias",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 4,
        uriIvoox = "$urlIvoox/160375202",
        title = "Sensogenoma: de cómo los genes responden al estímulo musical",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 5,
        uriIvoox = "$urlIvoox/160375202",
        title = "Humanidades enerxéticas",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 6,
        uriIvoox = "$urlIvoox/160424183",
        title = "¿Y si hablamos de Párkinson? Ciencia que siente, vivencias que enseñan",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 7,
        uriIvoox = "$urlIvoox/160424183",
        title = "Afrontar los retos de la maricultura: Resiliencia, sostenibilidad y crecimiento azul",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 8,
        uriIvoox = "$urlIvoox/160426431",
        title = "Simulación computacional: comportamiento de moléculas en la membrana molecular",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 9,
        uriIvoox = "$urlIvoox/160465324",
        title = "Investigación educativa como motor para la transformación social",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 10,
        uriIvoox = "$urlIvoox/160465439",
        title = "El postdoc en iMATUS: Ciencia en primera persona",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 11,
        uriIvoox = "$urlIvoox/160473460",
        title = "Gastronom-IA: el CiTIUS revela su receta secreta para atraer talento internacional",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
    Podcast(
        id = 12,
        uriIvoox = "$urlIvoox/160621323",
        title = "Instituto da Lingua Galega: estudar o pasado e garantir o futuro",
        imaxe = {
            AsyncImage(
                model = "$urlRecursosApp/$imaxesJPG/logo_podcasts.jpeg",
                contentDescription = "Imagen remota en formato jpeg",
            )
        }
    ),
)
val videosMiradasDoTalento = listOf(
    VideoVimeo(
        identificadorVimeo = "1125803745/7c65eabe04",
        description = "CiQus",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo()
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125838463",
        description = "Cretus",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo()
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125830536/f836aac6d2",
        description = "Idis",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo()
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125788555/fae73aaaaa",
        description = "Igfae",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo()
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125824699/98afbb1cb6",
        description = "Citius",
        imaxe = {
            ImageAsyncVimeo()
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125795571/97f66f77d9",
        description = "Cimus",
        imaxe = {
            ImageAsyncVimeo()
        }
    )
)
class MultimediaRepository (){

    fun getListPodcasts(): List<Podcast> {
        //return podcastsMultimedia
        return listaPodcasts
    }

    fun getListVideosYoutube() : List<VideoVimeo>{
        //return videosMultimedia
        return videosMiradasDoTalento
    }


}