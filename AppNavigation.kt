package com.example.shishusneh.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shishusneh.screens.*

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("dashboard") {
            DashboardScreen(navController)
        }

        composable("growth") {
            GrowthTrackerScreen()
        }

        composable("vaccination") {
            VaccinationScreen()
        }

        composable("feeding") {
            FeedingGuideScreen()
        }
    }
}