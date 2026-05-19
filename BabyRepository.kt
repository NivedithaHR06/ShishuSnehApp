package com.example.shishusneh.repository

import com.example.shishusneh.database.BabyDao
import com.example.shishusneh.database.BabyEntity

class BabyRepository(private val babyDao: BabyDao) {

    suspend fun insertBaby(baby: BabyEntity) {
        babyDao.insertBaby(baby)
    }

    suspend fun getAllBabies(): List<BabyEntity> {
        return babyDao.getAllBabies()
    }
}