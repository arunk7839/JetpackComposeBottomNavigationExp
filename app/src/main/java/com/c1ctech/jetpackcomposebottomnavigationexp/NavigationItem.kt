package com.c1ctech.jetpackcomposebottomnavigationexp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Home : NavigationItem("home", Icons.Filled.Home, "Home")
    object Place : NavigationItem("place", Icons.Filled.Place, "Place")
    object Favorites : NavigationItem("favorites", Icons.Filled.Favorite, "Favorites")
}
