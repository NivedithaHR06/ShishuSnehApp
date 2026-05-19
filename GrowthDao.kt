package com.example.shishusneh.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GrowthDao {

    @Insert
    suspend fun insertGrowth(growth: GrowthEntity)

    @Query("SELECT * FROM growth_table")
    suspend fun getAllGrowth(): List<GrowthEntity>
}