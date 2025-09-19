package com.example.multiidioma.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.example.multiidioma.data.types.Podcast

fun OpenSpotify(context: Context, podcast: Podcast) {
    val intent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse(podcast.uriSpotifyApp)
        putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://${context.packageName}"))
    }

    if (intent.resolveActivity(context.packageManager) != null) {
        context.startActivity(intent)
    } else {
        val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(podcast.uriSpotifyWeb))
        context.startActivity(webIntent)
    }
}


