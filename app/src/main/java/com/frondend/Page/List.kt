package com.frondend.Page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frondend.Data.AllData
import com.frondend.Model.ListMovie
import com.frondend.Page.Component.ItemList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Listt(
    modifier: Modifier = Modifier,
    movie: List<ListMovie> = AllData.listMovie,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xfff121212),

                    ),
                title = {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = "List Screen",
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
        LazyVerticalGrid(
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            columns = GridCells.Adaptive(150.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(movie, key = { it.id }) {
                ItemList(movie = it)
            }
        }
    }

}