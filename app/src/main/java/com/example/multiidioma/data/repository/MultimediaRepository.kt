package com.example.multiidioma.data.repository

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R

val porcentaxeBandeira = 0.5f
class MultimediaRepository (){

    data class Podcast(
        val uriSpotifyApp: String,
        val uriSpotifyWeb: String,
        val protagonista: String,
        val title : String,
        val imaxe : @Composable () -> Unit
    )

    fun ListPodcasts(): List<Podcast> {
        return listOf(
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
    }

}