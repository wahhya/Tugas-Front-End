package com.frondend.Page.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frondend.Model.Home
import com.frondend.R

@Composable
fun ItemHome(
    home: Home,
    onItemClicked: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(

    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier
                .clickable {
                    onItemClicked(home.id)
                }
                .padding(8.dp)

        ) {
            Image(
                painter = painterResource(id = home.image),
                contentScale = ContentScale.Crop,
                contentDescription = null, modifier = Modifier

                    .size(150.dp)
            )

            Text(
                text = home.judul,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffFFFFFF)
                ),
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                maxLines = 1


            )
            Text(
                text = home.tahun,
                style = TextStyle(
                    fontSize = 8.sp,
                ),
                color = MaterialTheme.colorScheme.primary,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(80.dp),
                maxLines = 1
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun ItemHomePrev() {
    ItemHome(
        home = Home(1, R.drawable.img1, "The Invisible Guest", "2016"),
        onItemClicked = { filmId ->
            println("Film Id : $filmId")
        }
    )
}