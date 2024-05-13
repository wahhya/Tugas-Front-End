package com.frondend.Page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.frondend.Data.AllData
import com.frondend.Model.Home
import com.frondend.Navigasi.Screen
import com.frondend.Page.Component.ItemHome
import com.frondend.Page.Component.ItemHomeColumn

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    homeSamping: List<Home> = AllData.listFilmRow,
    homeBawah: List<Home> = AllData.listFilmColumn,
) {
    Scaffold(
        topBar = {
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
                            text = "Home Screen",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        )
                    }

                }

            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "Rekomendasi",
                modifier = Modifier.padding(bottom = 4.dp, top = 30.dp, start = 10.dp),
                textAlign = TextAlign.Start,
            )
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(2.dp),
                modifier = modifier
            ) {

                item {
                    LazyRow(
                        contentPadding = PaddingValues(2.dp),
                        horizontalArrangement = Arrangement.spacedBy(3.dp),
                        modifier = modifier
                    ) {
                        items(homeSamping, key = { it.id }) {
                            ItemHome(
                                home = it,
                                onItemClicked = { filmId -> navController.navigate(Screen.Detail.route + "/$filmId") })
                        }
                    }
                }
                items(homeBawah, key = { it.id }) {
                    ItemHomeColumn(
                        home = it,
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )

                }
            }
        }
    }

}