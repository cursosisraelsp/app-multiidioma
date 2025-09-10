package com.example.multiidioma.data.repository

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.data.types.VideoYoutube

val porcentaxeBandeira = 0.5f;
val podcastsMultimedia = listOf(
    Podcast(
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


class MultimediaRepository (){



    fun getListPodcasts(): List<Podcast> {
        return podcastsMultimedia
    }

    fun getListVideosYoutube() : List<VideoYoutube>{
        return videosMultimedia
    }


}