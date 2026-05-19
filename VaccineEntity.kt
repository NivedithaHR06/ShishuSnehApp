package com.example.shishusneh.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vaccine_table")
data class VaccineEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val vaccineName: String,
    val dueDate: String,
    val status: String
)