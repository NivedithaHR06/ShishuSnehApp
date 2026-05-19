package com.example.shishusneh.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VaccinationScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Vaccination Schedule",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {

                Text("BCG Vaccine")
                Text("Due: At Birth")

                Spacer(modifier = Modifier.height(12.dp))

                Text("Polio Vaccine")
                Text("Due: 6 Weeks")

                Spacer(modifier = Modifier.height(12.dp))

                Text("Hepatitis B")
                Text("Due: 6 Weeks")
            }
        }
    }
}