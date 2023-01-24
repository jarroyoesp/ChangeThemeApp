package com.jarroyo.changetheme.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet
import com.jarroyo.changetheme.ui.screens.ChangeThemeBottomSheet
import com.jarroyo.changetheme.ui.screens.ChangeThemeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.ChangeTheme.route,
        builder = {
            addBottomSheetDestinations(navController)
            addComposableDestinations(navController)
        }
    )
}

fun NavGraphBuilder.addComposableDestinations(navController: NavHostController) {
    val destination = Screens.ChangeTheme.route
    composable(destination) { ChangeThemeScreen(navController = navController) }
}

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.addBottomSheetDestinations(navController: NavHostController) {
    val destination = BottomSheets.ChangeThemeBottomSheet.route
    bottomSheet(destination) {
        ChangeThemeBottomSheet(navController)
    }
}