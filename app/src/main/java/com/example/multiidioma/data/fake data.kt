package com.example.multiidioma.data

import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.R

fun samplePodcasts(): List<Podcast> {
    return listOf(
        Podcast(
            id = 1,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Juan Pérez",
            title = "Podcast 1",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 1"
                )
            }
        ),
        Podcast(
            id = 2,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Ana Gómez",
            title = "Podcast 2",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 2"
                )
            }
        ),
        Podcast(
            id = 3,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Luis Díaz",
            title = "Podcast 3",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 3"
                )
            }
        ),
        Podcast(
            id = 4,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Laura Sánchez",
            title = "Podcast 4",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 4"
                )
            }
        ),
        Podcast(
            id = 5,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Carlos Ruiz",
            title = "Podcast 5",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 5"
                )
            }
        ),
        Podcast(
            id = 6,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "María López",
            title = "Podcast 6",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 6"
                )
            }
        ),
        Podcast(
            id = 7,
            uriSpotifyApp = "",
            uriSpotifyWeb = "",
            protagonista = "Pedro Fernández",
            title = "Podcast 7",
            imaxe = {
                Image(
                    painterResource(R.drawable.noimagen),
                    contentDescription = "Podcast 7"
                )
            }
        )
    )
}
