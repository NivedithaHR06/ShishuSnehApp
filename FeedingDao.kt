package com.example.shishusneh.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeedingDao {

    @Insert
    suspend fun insertFeeding(feeding: FeedingEntity)

    @Query("SELECT * FROM feeding_table")
    suspend fun getAllFeedings(): List<FeedingEntity>
}