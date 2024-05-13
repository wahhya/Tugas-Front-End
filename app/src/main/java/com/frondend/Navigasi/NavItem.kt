package com.frondend.Navigasi

import android.graphics.drawable.Icon
import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen,
)
