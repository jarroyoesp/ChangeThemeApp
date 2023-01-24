package com.jarroyo.changetheme.ui.navigation

sealed class Screens(val route: String) {
    object ChangeTheme: Screens("change_theme_screen")
}

sealed class BottomSheets(val route: String) {
    object ChangeThemeBottomSheet: BottomSheets("change_theme_bottom_sheet")
}