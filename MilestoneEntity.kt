package com.example.shishusneh.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "milestone_table")
data class MilestoneEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val milestone: String,
    val completed: Boolean
)