package com.example.shishusneh.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "growth_table")
data class GrowthEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val month: String,
    val weight: String,
    val height: String
)