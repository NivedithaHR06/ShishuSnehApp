package com.example.shishusneh.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Mother & Baby Profile",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Mother Name: Keerthana")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Baby Age: 3 Months")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Village: Tiptur")
    }
}