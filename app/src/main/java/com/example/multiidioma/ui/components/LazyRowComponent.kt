package com.example.multiidioma.ui.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.types.Podcast

@Composable
fun LazyRowComponent(
    podcasts: List<Podcast>,
    destination: Destination,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(podcasts) { podcast ->
            LazyRowPersonalComponent(
                podcast = podcast,
                onClick = {
                    val route = when (destination) {
                        is Destination.Detail -> Destination.createDetailRoute(podcast.id.toString())
                        else -> destination.route
                    }
                    navController.navigate(route)
                }
            )
        }
    }
}