package com.example.shishusneh.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface VaccineDao {

    @Insert
    suspend fun insertVaccine(vaccine: VaccineEntity)

    @Query("SELECT * FROM vaccine_table")
    suspend fun getAllVaccines(): List<VaccineEntity>
}