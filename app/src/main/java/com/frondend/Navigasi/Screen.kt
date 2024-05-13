package com.frondend.Navigasi

sealed class Screen(val route:String) {
    data object Home :Screen("Home")
    data object List :Screen("List")
    data object About :Screen("About")
    data object Detail :Screen("Detail")
}