package com.example.shishusneh.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MilestoneDao {

    @Insert
    suspend fun insertMilestone(milestone: MilestoneEntity)

    @Query("SELECT * FROM milestone_table")
    suspend fun getAllMilestones(): List<MilestoneEntity>
}