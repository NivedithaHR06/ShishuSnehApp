package com.example.shishusneh.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BabyDao {

    @Insert
    suspend fun insertBaby(baby: BabyEntity)

    @Query("SELECT * FROM baby_table")
    suspend fun getAllBabies(): List<BabyEntity>
}