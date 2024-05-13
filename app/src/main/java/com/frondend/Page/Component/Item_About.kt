package com.frondend.Page.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frondend.Model.About

@Composable
fun AboutItem(about: About) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            bottom = 30.dp,
            top = 30.dp
        )
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(
                30.dp
            )
        ) {
            Image(
                painter = painterResource(id = about.image),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .fillMaxSize()
            )
        }
        Text(
            text = "Nama          : ${about.nama}",
            style = TextStyle(
                fontSize = 13.sp,

                ),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 30.dp, bottom = 10.dp)

        )
        Text(
            text = "Email           : ${about.email}",
            style = TextStyle(
                fontSize = 13.sp,

                ),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 30.dp,bottom = 10.dp)
        )
        Text(
            text = "Universitas : ${about.apt}",
            style = TextStyle(
                fontSize = 13.sp,

                ),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 30.dp,bottom = 10.dp)
        )
        Text(
            text = "Jurusan      : ${about.jurusan}",
            style = TextStyle(
                fontSize = 13.sp,

                ),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 30.dp,bottom = 10.dp)
        )
    }
}