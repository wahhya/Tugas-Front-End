package com.frondend.Page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.frondend.Data.AllData
import com.frondend.Model.Home
import com.frondend.Navigasi.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailHome(
    navController: NavController,
    filmId: Int?,
    modifier: Modifier = Modifier
) {

    Scaffold(
        topBar = {
            Row(
            ) {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xfff121212)

                        ),
                    title = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "About Screen",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            )
                        }

                    },
                    navigationIcon = {
                        IconButton(
                            onClick = { navController.popBackStack() },
                            modifier = Modifier
                        ) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                        }
                    }
                )
            }
        }) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
        ) {
            Column {
                val filmList = AllData.listFilmRow.filter { home ->
                    home.id == filmId
                }

                Column(
                    modifier = modifier
                ) {
                    DetailHomeContent(filmList = filmList)
                }
            }
        }

    }


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailHomeContent(
    filmList: List<Home>,
    modifier: Modifier = Modifier
) {
    Column (

        modifier = Modifier.padding(20.dp)
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = filmList[0].image)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp),

            contentDescription = "Poster Movie"
        )
    }
    Spacer(modifier = Modifier.width(5.dp))
    Column(modifier = Modifier.padding(start = 15.dp)) {
        Text(
            text = filmList[0].judul,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "(${filmList[0].tahun})",
            style = MaterialTheme.typography.titleSmall,
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun DetailHomePre() {
    DetailHomeContent(filmList = AllData.listFilmRow)
}