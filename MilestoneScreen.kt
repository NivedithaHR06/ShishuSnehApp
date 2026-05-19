package com.example.shishusneh.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun MilestoneScreen() {

    var smileChecked by remember { mutableStateOf(false) }
    var crawlChecked by remember { mutableStateOf(false) }
    var walkChecked by remember { mutableStateOf(false) }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Milestone Checklist",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Row {

                    Checkbox(
                        checked = smileChecked,
                        onCheckedChange = {
                            smileChecked = it
                        }
                    )

                    Text("Baby Started Smiling")
                }

                Row {

                    Checkbox(
                        checked = crawlChecked,
                        onCheckedChange = {
                            crawlChecked = it
                        }
                    )

                    Text("Baby Started Crawling")
                }

                Row {

                    Checkbox(
                        checked = walkChecked,
                        onCheckedChange = {
                            walkChecked = it
                        }
                    )

                    Text("Baby Started Walking")
                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = {

                        Toast.makeText(
                            context,
                            "Milestones Saved",
                            Toast.LENGTH_SHORT
                        ).show()
                    },

                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text("Save Milestones")
                }
            }
        }
    }
}