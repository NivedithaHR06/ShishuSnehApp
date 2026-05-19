package com.example.shishusneh.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "feeding_table")
data class FeedingEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val foodName: String,
    val time: String,
    val notes: String
)