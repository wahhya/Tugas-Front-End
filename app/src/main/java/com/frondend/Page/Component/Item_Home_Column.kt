package com.frondend.Page.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frondend.Model.Home


@Composable
fun ItemHomeColumn(
    modifier: Modifier = Modifier,
    home: Home,
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxWidth()
            .padding(6.dp)

    ) {
        Image(
            painter = painterResource(id = home.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(width = 350.dp, height = 250.dp)

        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = home.judul, color = MaterialTheme.colorScheme.primary,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xffFFFFFF)
            ),
        )
        Text(
            text = home.tahun,
            style = TextStyle(
                fontSize = 8.sp,
            ),
        )
    }

}