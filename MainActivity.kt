package com.example.shishusneh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.shishusneh.navigation.AppNavigation
import com.example.shishusneh.ui.theme.ShishuSnehTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ShishuSnehTheme {

                val navController = rememberNavController()

                AppNavigation(navController)

            }
        }
    }
}