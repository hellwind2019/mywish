package com.hellwind.mywish.bottom_navigation

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.compose.MyWishTheme
import com.hellwind.mywish.R

@Composable
fun BottomNavigation(navController: NavController) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4,
    )
    NavigationBar{
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach{item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    if(currentRoute != item.route)
                    navController.navigate(item.route)
                },
                icon = { Icon(imageVector = Icons.Default.Done, contentDescription = item.route) },
                label = {
                    Text(text = item.title, style = MaterialTheme.typography.labelMedium)
                },

//                colors = NavigationBarItemColors(
//                    selectedIconColor = MaterialTheme.colorScheme.primary,
//                    unselectedIconColor = MaterialTheme.colorScheme.secondary,
//                    selectedTextColor = TODO(),
//                    selectedIndicatorColor = TODO(),
//                    unselectedTextColor = TODO(),
//                    disabledIconColor = TODO(),
//                    disabledTextColor = TODO(),
//                )
            )
        }
    }
}