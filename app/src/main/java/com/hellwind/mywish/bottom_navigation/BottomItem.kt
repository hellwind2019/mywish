package com.hellwind.mywish.bottom_navigation

import androidx.compose.material.icons.Icons
import com.hellwind.mywish.R

sealed class BottomItem(val title: String, val iconId : Int, val route : String) {
    object Screen1: BottomItem("Screen 1", R.drawable.ic_launcher_foreground, "screen_1")
    object Screen2: BottomItem("Screen 2", R.drawable.ic_launcher_foreground, "screen_2")
    object Screen3: BottomItem("Screen 3", R.drawable.ic_launcher_foreground, "screen_3")
    object Screen4: BottomItem("Screen 4", R.drawable.ic_launcher_foreground, "screen_4")

}