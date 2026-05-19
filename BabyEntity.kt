package com.example.shishusneh.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "baby_table")
data class BabyEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String,
    val age: String,
    val gender: String,
    val weight: String,
    val height: String
)