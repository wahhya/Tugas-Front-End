package com.frondend.Navigasi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Rgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.frondend.Page.About
import com.frondend.Page.DetailHome
import com.frondend.Page.Home
import com.frondend.Page.Listt
import com.frondend.R
import okhttp3.internal.wait


@Composable
fun Nav(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        bottomBar = {
            BottomBar(navController)
        },

        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                Home(navController)
            }

            composable(Screen.List.route) {
                Listt()
            }

            composable(Screen.About.route) {
                About()
            }
            composable(
                Screen.Detail.route + "/{filmId}",
                arguments = listOf(navArgument("filmId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailHome(
                    navController = navController,
                    filmId = navBackStackEntry.arguments?.getInt("filmId")
                )
            }
        }
    }
}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        contentColor = MaterialTheme.colorScheme.contentColorFor(Color(0xff121212)),
        tonalElevation = NavigationBarDefaults.Elevation.div(20)
        ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route


        val NavItem = listOf(
            NavItem(
                title = stringResource(id = R.string.home),
                icon = Icons.Default.Home,
                screen = Screen.Home,
            ),
            NavItem(
                title = stringResource(id = R.string.list),
                icon = Icons.Default.List,
                screen = Screen.List,
            ),
            NavItem(
                title = stringResource(id = R.string.about),
                icon = Icons.Default.Person,
                screen = Screen.About,
            ),
        )
        NavItem.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,

                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = Color.White,
                    )
                },
                label = { Text(text = item.title) }
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
private fun NavPrev() {
    Nav()
}