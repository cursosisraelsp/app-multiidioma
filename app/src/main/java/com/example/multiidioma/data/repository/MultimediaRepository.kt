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
        title = "Ondas gravitacionales",//Ondas gravitacionales: entender el universo a través de su violencia
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
        title = "El radón ...",//El radón en Galicia
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
        title = "Consumo de sustancias en estudiantes",//Consumo de sustancias en estudiantes: factores explicativos y consecuencias
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
        title = "Los genes responden al estímulo musical",//Sensogenoma: de cómo los genes responden al estímulo musical
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
        title = "¿Y si hablamos de Párkinson?",//¿Y si hablamos de Párkinson? Ciencia que siente, vivencias que enseñan
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
        title = "Resiliencia y crecimiento azul",//Afrontar los retos de la maricultura: Resiliencia, sostenibilidad y crecimiento azul
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
        title = "Simulación computacional",//Simulación computacional: comportamiento de moléculas en la membrana molecular
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
        title = "Investigación educativa - transformación social",//Investigación educativa como motor para la transformación social
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
        title = "Ciencia en primera persona",//El postdoc en iMATUS: Ciencia en primera persona
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
        title = "Atraer talento internacional",//Gastronom-IA: el CiTIUS revela su receta secreta para atraer talento internacional
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
        title = "Estudar o pasado e garantir o futuro",//Instituto da Lingua Galega: estudar o pasado e garantir o futuro
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
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125838463",
        description = "Cretus",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125830536/f836aac6d2",
        description = "Idis",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125788555/fae73aaaaa",
        description = "Igfae",
        imaxe = {
            //ClickableImagePodcast(podcastUrl = )
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125824699/98afbb1cb6",
        description = "Citius",
        imaxe = {
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125795571/97f66f77d9",
        description = "Cimus",
        imaxe = {
            ImageAsyncVimeo("logo_vimeo.jpeg")
        }
    )
)
val videosShortsIhus = listOf(
    VideoVimeo(
        identificadorVimeo = "1125802206/660aa8de35",
        description = "D. Jorge Sacido Romero",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125802242/bc17b2b436",
        description = "Dna. Laura Lojo Rodríguez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125802304/bde4d8314b",
        description = "D. Miguel Anxo Rodríguez González",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125802304/bde4d8314b",
        description = "Dna. Montserrat Capelán Fernández",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125802445/1a1bab41ab",
        description = "Dna. Alejandra Ulla Lorenzo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    )
)
val videosShortsCretus = listOf(
    VideoVimeo(
        identificadorVimeo = "1125822237/c4cdb716e8",
        description = "Dna. María Teresa Moreira Vilar",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125822305/9c4ba33e54",
        description = "D. Sergio Vila Tojo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125822369/66ec61b2bc",
        description = "D. Juan Antelo Martínez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125822424/4f057b6a92",
        description = "D. José Luis Ares Sainz",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125822439/ed346b02b2",
        description = "D. Jorge González Rodríguez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125822492/d97b0fdc71",
        description = "Dna. Raquel Fariñas Mera",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125822550/4bcbac8de0",
        description = "Dna. María Llompart Vizoso",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    )
)
val videosShortsIdis = listOf(
    VideoVimeo(
        identificadorVimeo = "1125833295/850210e2b4",
        description = "Dna. Mª Luz Couce Pico",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125833359/46099a49d6",
        description = "Dna. Laura Muinelo Romay",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125833419/d1f9a318d4",
        description = "Dna. Ana Belén Crujeiras Martínez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833477/8525cf5968",
        description = "D. Alberto Ouro Villasante",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125833508/ef16487bc1",
        description = "D. Francisco Campos Pérez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833557/973022b26b",
        description = "Dna. Lucía del Pozo Filiu",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833576/a67090956a",
        description = "Dna. Ana Bugallo Casal",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833608/6d57791816",
        description = "Dna. Maite López López",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833653/12d75e0a08",
        description = "D. Ramón Iglesias Rey",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833681/ffb719bc60",
        description = "D. Antonio Salas Ellacuriaga",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833722/eeb7eaeccc",
        description = "Dna. Susana Bravo López",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125833755/0ae219f900",
        description = "D. Rodolfo Gómez Bahamonde",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    )
)
val videosShortsIlg = listOf(
    VideoVimeo(
        identificadorVimeo = "1126101818/2a6df77c21",
        description = "Dna. Elisa Fernández Rei",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126101853/2b9a5ed947",
        description = "D. Francisco Dubert García",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126101957/821be16604",
        description = "Dna. Ana Isabel Boullón Agrelo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126102020/98c35b5b99",
        description = "D. Xulio Sousa Fernández",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
)
val videosShortsCimus = listOf(
    VideoVimeo(
        identificadorVimeo = "1125781084/c37495252b",
        description = "Dna. María Isabel Loza García",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125768873/960bccf60a",
        description = "D. Ángel Carracedo Álvarez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125768943/18ef454f07",
        description = "D. José Manuel Brea Floriani",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125768973/d081e111fe",
        description = "D. José Manuel Brea Floriani",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125768973/d081e111fe",
        description = "D. Ricardo Villa Bellosta",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125769001/fd20390bda",
        description = "Dna. Clara V. Álvarez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125769031/1ec280ab2e",
        description = "Dna. Iria Gómez Touriño ",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125769171/fdaa8def56",
        description = "D. Miguel López",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
    VideoVimeo(
        identificadorVimeo = "1125769188/1fcddf6db6",
        description = "Dna. Alba Vietes Prado",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),

    VideoVimeo(
        identificadorVimeo = "1125769211/305b1ead52",
        description = "D. Pablo Aguiar ",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125769234/2ffcae3498",
        description = "Dna. Yolanda Prezado ",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125769257/44414272f5",
        description = "Dna. Jannette Rodríguez Pallares",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),
)
val videosShortsIce = listOf(
    VideoVimeo(
        identificadorVimeo = "1125791073/9c46bfc181",
        description = "Dna. Carmen Fernández Morante",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125791115/35abe606c6",
        description = "Dna. Beatriz Cebreiro López",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125791145/210651a980",
        description = "Dna. Silvana Longueira Matos",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125791189/c6ccbdbe78",
        description = "D. Miguel Ángel Santos Regos",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125791233/15b34c9a12",
        description = "Dna. María del Mar Lorenzo Moledo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125791260/ea62317675",
        description = "D. Marcos Mecías Calvo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125790920/e0ea09a6c3",
        description = "Dna. Ana Porto Castro",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1125790979/4c53b83648",
        description = "Dna. Marta Neira Rodríguez",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    )
)
val videosShortIgfae = listOf(
    VideoVimeo(
        identificadorVimeo = "1126105651/df6cf63d6c",
        description = "D. Carlos A. Salgado López",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126105724/7a00904099",
        description = "D. Yassid Ayyad",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126105765/c3befde1e0",
        description = "D. Alfonso Vázquez Ramallo",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
        }
    ),VideoVimeo(
        identificadorVimeo = "1126105828/d38139886d",
        description = "Dna. Li Meijian",
        imaxe = {
            ImageAsyncVimeo("logo_shorts.jpeg")
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

    fun getListvideosShortsIhus(): List<VideoVimeo>{
        return videosShortsIhus
    }

    fun getListVideosvideosShortsCretus(): List<VideoVimeo>{
        return videosShortsCretus
    }

    fun getListVideosShortsIdis(): List<VideoVimeo>{
        return videosShortsIdis
    }
    fun getListVideosShortsIlg(): List<VideoVimeo>{
        return videosShortsIlg
    }

    fun getListVideoShortsCimus(): List<VideoVimeo>{
        return videosShortsCimus
    }

    fun getListVideosShortIce():List<VideoVimeo>{
        return videosShortsIce
    }

    fun getListVideosShortsIgfae():List<VideoVimeo>{
        return videosShortIgfae
    }

}