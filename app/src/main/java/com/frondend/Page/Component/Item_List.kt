package com.frondend.Page.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.frondend.Model.ListMovie

@Composable
fun ItemList(
    modifier: Modifier = Modifier,
    movie: ListMovie,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = movie.photo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 100.dp, height = 170.dp)


        )
    }
}