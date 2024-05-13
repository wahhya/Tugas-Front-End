package com.frondend.Page


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import com.frondend.Data.AllData
import com.frondend.Model.About
import com.frondend.Page.Component.AboutItem


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About(
    aboutList: List<About> = AllData.getAboutData(),
    modifier: Modifier = Modifier
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
                            text = "About Screen",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        )
                    }

                }

            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
        ) {
            aboutList.forEach { about ->
                AboutItem(about = about)
            }
        }
    }
}